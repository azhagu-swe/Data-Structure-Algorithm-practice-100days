# 📘 Day 62: Stream API Practice (May 31, 2025)

Today's exercises focus on using Java's **Stream API** for operations like filtering, deduplication, and processing collections in a functional style.

---

## 🧠 Concepts Covered

1. **Stream API Basics**:

   * Streams represent a sequence of elements from a source that can be processed.
   * Common operations include `filter`, `map`, `distinct`, and `collect`.

2. **Filtering**: Extract elements based on a condition.

3. **Deduplication**: Using `distinct` to remove duplicate values.

4. **Functional Composition**: Chaining operations like `filter` and `toList`.

---

## 🛠️ Code Implementations

### 1. **Remove Duplicates**

This example removes duplicate integers from a list, keeping only distinct values greater than 1.

```java
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> removeDuplicates = numbers.stream()
                                                .filter(num -> num > 1)
                                                .distinct()
                                                .toList();

        System.out.println(removeDuplicates); // Output: [2, 3, 4, 5]
    }
}
```

---

### 2. **Filter Even Numbers**

Filter and print even numbers from a given range.

```java
import java.util.Arrays;
import java.util.stream.IntStream;

public class FilterEven {
    public static void main(String[] args) {
        int[] evenNumbers = IntStream.range(1, 10)
                                     .filter(n -> n % 2 == 0)
                                     .toArray();

        System.out.println(Arrays.toString(evenNumbers)); // Output: [2, 4, 6, 8]
    }
}
```

---

### 3. **Filter Strings by Length**

Filter names with a length greater than 4 characters.

```java
import java.util.List;

public class FilterString {
    public static void main(String[] args) {
        List<String> names = List.of("mani", "kandan", "Alagu", "azhagu", "dheeran");

        List<String> filterNames = names.stream()
                                        .filter(name -> name.length() > 4)
                                        .toList();

        System.out.println(filterNames); // Output: [kandan, azhagu, dheeran]
    }
}
```

---

### 4. **Filter Numbers Greater Than 1**

Filter integers greater than 1.

```java
import java.util.Arrays;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> uniqueArray = array.stream()
                                         .filter(num -> num > 1)
                                         .toList();

        System.out.println(uniqueArray); // Output: [2, 3, 4, 5, 6, 7]
    }
}
```

---

## ✨ Key Takeaways

1. **Streams Simplify Processing**:

   * Declarative, readable code.
   * Less boilerplate compared to loops.

2. **Operations to Remember**:

   * `filter`: Apply a condition to include/exclude elements.
   * `distinct`: Remove duplicate elements.
   * `toList`: Convert the stream back to a collection.

3. **Efficiency**:
   Streams are lazy; intermediate operations (e.g., `filter`, `map`) are only executed when a terminal operation (e.g., `toList`, `collect`) is invoked.

---

🎉 Successfully completed **Day 62**! Ready for more stream magic tomorrow! 🚀
# 📘 Day 63: Advanced Stream Operations (June 1, 2025)

Today's practice emphasizes **Java Stream API** for advanced operations, including grouping, sorting, parallel processing, and aggregations.

---

## 🧠 Concepts Covered

1. **Grouping with Streams**:

   * Using `Collectors.groupingBy` for categorization and counting.

2. **Sorting**:

   * Sorting integers in ascending and descending orders.

3. **Parallel Streams**:

   * Utilizing `parallel()` for concurrent processing.

4. **Aggregation**:

   * Finding the maximum and minimum using `Stream.max` and `Stream.min`.

5. **Element Counting**:

   * Counting occurrences of elements in an array or string.

---

## 🛠️ Code Implementations

### 1. **Count Vowels and Consonants**

Categorize and count vowels and consonants in a string.

```java
import java.util.Map;
import java.util.stream.Collectors;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String sentence = "hello world!";

        Map<String, Long> count = sentence.chars()
                                          .mapToObj(c -> (char) c)
                                          .filter(Character::isLetter)
                                          .collect(Collectors.groupingBy(
                                              c -> "aeiouAEIOU".indexOf(c) >= 0 ? "Vowels" : "Consonants",
                                              Collectors.counting()
                                          ));

        System.out.println(count); // Output: {Consonants=7, Vowels=3}
    }
}
```

---

### 2. **Count Character Frequencies**

Count occurrences of each character in a string.

```java
import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        String sentence = "hello world!";

        Map<Character, Long> letterCount = sentence.chars()
                                                   .mapToObj(c -> (char) c)
                                                   .collect(Collectors.groupingBy(
                                                       e -> e, Collectors.counting()
                                                   ));

        System.out.println(letterCount); 
        // Output: { =1, !=1, d=1, e=1, h=1, l=3, o=2, r=1, w=1}
    }
}
```

---

### 3. **Sorting an Array**

Sort an array in ascending and descending order.

```java
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 42, 1, 36, 7, 8 };

        List<Integer> ascending = IntStream.of(arr).sorted().boxed().toList();
        System.out.println(ascending); // Output: [1, 2, 3, 7, 8, 9, 36, 42]

        List<Integer> descending = IntStream.of(arr).boxed()
                                             .sorted((a, b) -> b - a)
                                             .toList();
        System.out.println(descending); // Output: [42, 36, 9, 8, 7, 3, 2, 1]
    }
}
```

---

### 4. **Parallel Stream Processing**

Demonstrate parallel processing with a stream.

```java
import java.util.stream.IntStream;

public class ParallelProcessingExample {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                 .parallel()
                 .forEach(System.out::println);
    }
}
```

---

### 5. **Find Maximum and Minimum**

Find the maximum and minimum values in an array.

```java
import java.util.Optional;
import java.util.stream.IntStream;

public class FindMaxStream {
    public static void main(String[] args) {
        Optional<Integer> max = IntStream.of(1, 2, 3, 4, 5, 6, 7).boxed().max(Integer::compareTo);
        Optional<Integer> min = IntStream.of(1, 2, 3, 4, 5, 6, 7).boxed().min(Integer::compareTo);

        max.ifPresent(value -> System.out.println(value)); // Output: 7
        min.ifPresent(value -> System.out.println(value)); // Output: 1
    }
}
```

---

### 6. **Count Element Frequencies in Array**

Count occurrences of each element in an array after sorting.

```java
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayElementCount {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 42, 1, 36, 7, 8, 3, 4, 64, 1, 2, 3, 34, 5, 6, 7 };

        arr = IntStream.of(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
        // Output: [1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7, 8, 9, 34, 36, 42, 64]

        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
                                                 .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(frequencyMap); 
        // Output: {1=2, 2=2, 3=3, 4=1, 5=1, 6=1, 7=2, 8=1, 9=1, 34=1, 36=1, 42=1, 64=1}
    }
}
```

---

## ✨ Key Takeaways

1. **Grouping and Counting**:

   * `Collectors.groupingBy` with `Collectors.counting` simplifies frequency calculations.

2. **Sorting**:

   * Sorting streams using `sorted()` for ascending order and custom comparators for descending order.

3. **Parallel Streams**:

   * Easily switch to parallel execution using `parallel()` for faster processing of large datasets.

4. **Max/Min Aggregations**:

   * Use `Stream.max` and `Stream.min` with custom comparators.

---

🎉 Successfully completed **Day 63**! 🚀
