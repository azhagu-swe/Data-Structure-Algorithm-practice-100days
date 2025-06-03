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

Here’s the corrected **Day 64** README with the problem count added in the title:

---

### Day 64 - Java DSA Practice (10 Problems)

#### **1. FizzBuzz Problem**

* **Description**: Write a program that prints the numbers from 1 to 100. For multiples of three, print “Fizz”; for multiples of five, print “Buzz”; and for numbers divisible by both, print “FizzBuzz”.
* **Code**:

```java
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                 .mapToObj(i -> (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                                i % 3 == 0 ? "Fizz" :
                                i % 5 == 0 ? "Buzz" : i)
                 .forEach(System.out::println);
    }
}
```

---

#### **2. Reverse a String**

* **Description**: Reverse a given string without using built-in functions.
* **Code**:

```java
public class ReverseStringTest {
    public static void main(String[] args) {
        String word = "Hello World!";
        char[] reverse = word.toCharArray();
        int start = 0, end = word.length() - 1;

        while (start < end) {
            char temp = reverse[start];
            reverse[start] = reverse[end];
            reverse[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(reverse));
    }
}
```

---

#### **3. Find the Missing Number**

* **Description**: Find the missing number in an array of distinct integers ranging from 0 to n.
* **Code**:

```java
import java.util.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 5, 2, 6, 4};
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();
        System.out.println(expectedSum - actualSum);
    }
}
```

---

#### **4. Check if a String is Palindrome**

* **Description**: Determine if a string reads the same backward as forward.
* **Code**:

```java
public class CheckStringPalindrome {
    public static void main(String[] args) {
        String word = "radar";
        boolean isPalindrome = new StringBuilder(word).reverse().toString().equals(word);
        System.out.println("Palindrome: " + isPalindrome);
    }
}
```

---

#### **5. Detect Duplicate Elements in an Array**

* **Description**: Find all duplicate elements in an array.
* **Code**:

```java
import java.util.*;

public class ArrayDuplicateElementsDetector {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};
        Set<Integer> duplicates = new HashSet<>();
        List<Integer> dupList = new ArrayList<>();

        for (int num : nums) {
            if (!duplicates.add(num)) dupList.add(num);
        }

        System.out.println(dupList);
    }
}
```

---

#### **6. Implement a Stack Using Arrays**

* **Description**: Implement a stack with basic operations: push, pop, and peek.
* **Code**:

```java
class Stack {
    private int[] data;
    private int top;

    public Stack(int size) {
        data = new int[size];
        top = -1;
    }

    public void push(int value) {
        data[++top] = value;
    }

    public int pop() {
        return data[top--];
    }

    public int peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(5);
        System.out.println(stack.pop());
    }
}
```

---

#### **7. Find the Longest Common Prefix**

* **Description**: Find the longest common prefix string among an array of strings.
* **Code**:

```java
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
```

---

#### **8. Count Words in a Sentence**

* **Description**: Count the number of words in a given sentence.
* **Code**:

```java
public class CountWordsInSentence {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        System.out.println(sentence.trim().split("\\s+").length);
    }
}
```

---

#### **9. Find the Maximum Subarray Sum**

* **Description**: Find the contiguous subarray with the largest sum (Kadane's Algorithm).
* **Code**:

```java
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = nums[0], currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
```

---

#### **10. Check for Balanced Parentheses**

* **Description**: Check if a string containing parentheses is balanced.
* **Code**:

```java
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isBalanced(str));
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else if (stack.isEmpty() || (c == ')' && stack.pop() != '(') ||
                     (c == '}' && stack.pop() != '{') ||
                     (c == ']' && stack.pop() != '[')) return false;
        }
        return stack.isEmpty();
    }
}
```

## 🌟 **Day 65: DSA Adventures with Java!** 🌟

### 🏆 **Problems Solved**

1. 🎭 **[Find the First Non-Repeating Character in a Stream](#1-find-the-first-non-repeating-character-in-a-stream)**
2. 🥈 **[Find the Second Largest Number in an Array](#2-find-the-second-largest-number-in-an-array)**
3. 🌀 **[Generate Fibonacci Series](#3-generate-fibonacci-series)**

---

### **1. 🎭 Find the First Non-Repeating Character in a Stream**

#### 📖 **Concept: The Queue Detective!**

* Imagine you're a detective 🕵️ tracking letters in a stream of text.
* Your goal is to spot the **first non-repeating character** 👀 at every step.
* If you can't find any, shout `#`!

#### 🛠 **Code**

```java
import java.util.*;

public class FirstNonRepeatingCharInStream {
    public static void main(String[] args) {
        String stream = "aabcbd";
        printFirstNonRepeating(stream);
    }

    private static void printFirstNonRepeating(String stream) {
        Queue<Character> queue = new LinkedList<>();
        int[] charCount = new int[26]; // Assuming lowercase English letters

        for (char c : stream.toCharArray()) {
            charCount[c - 'a']++;  // Count occurrences
            queue.add(c);          // Add to the queue

            // Remove repeating characters from the queue
            while (!queue.isEmpty() && charCount[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            // Print the result
            if (queue.isEmpty()) {
                System.out.print("#");
            } else {
                System.out.print(queue.peek() + "");
            }
        }
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `"aabcbd"`
* **Output**: `"a#bbcc"`

---

### **2. 🥈 Find the Second Largest Number in an Array**

#### 📖 **Concept: The Medal Race 🏅**

* Think of an **array** as a race track 🏃.
* Every number competes to become **the largest** 🏆 and **second largest** 🥈.
* Your task is to keep track of both and announce the **runner-up**!

#### 🛠 **Code**

```java
public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = arr[0], secondLargest = arr[0];
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;    // Update second largest
            }
        }
        System.out.println(secondLargest);
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `[12, 35, 1, 10, 34, 1]`
* **Output**: `34`

---

### **3. 🌀 Generate Fibonacci Series**

#### 📖 **Concept: The Magical Spiral 🌈**

* The **Fibonacci sequence** is like building blocks 🧱:
  Start with `0` and `1`, then add the last two numbers to make the next one!
* Keep going until you build your series.

#### 🛠 **Code**

```java
import java.util.Arrays;

public class Fibonacci1 {
    public static void main(String[] args) {
        int n = 10;
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        System.out.println(Arrays.toString(fibo));
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `n = 10`
* **Output**: `[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]`

---

### 🎉 **Reflection**

* 🧩 **Non-Repeating Detective**: Solved a fun **streaming** problem using **queues**.
* 🥈 **Runner-Up Hunt**: Mastered the **largest and second largest tracker** in arrays.
* 🌀 **Fibonacci Fun**: Explored the **magic of recursion-free sequences**!

---

Enjoy coding! 🚀 Keep up the streak and make every day count! 🎯
