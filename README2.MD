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
