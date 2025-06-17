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

Here's the **README.md for Day 67**, complete with fun emojis, simplified concepts, and engaging explanations:

---

## 🌟 **Day 67: Mastering Search, Missing Numbers, and Reverse Magic** 🌟

### 🏆 **Problems Solved**

1. 🔍 **[Binary Search (Recursive)](#1-binary-search-recursive)**
2. 🔢 **[Find the Missing Number (Sum and XOR)](#2-find-the-missing-number-sum-and-xor)**
3. 🔄 **[Reverse a String](#3-reverse-a-string)**

---

### **1. 🔍 Binary Search (Recursive)**

#### 📖 **Concept: Divide and Conquer 🪓**

* Divide the sorted array into halves until the target is found.
* Each step reduces the search space by half – 🚀 fast and efficient!

#### 🛠 **Code**

```java
public class BSearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9, start = 0, end = numbers.length - 1;
        int index = binarySearch(numbers, start, end, target);
        System.out.println(index);
    }

    private static int binarySearch(int[] numbers, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (numbers[mid] == target)
            return mid;
        else if (numbers[mid] > target)
            return binarySearch(numbers, start, mid - 1, target);
        else
            return binarySearch(numbers, mid + 1, end, target);
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: Array: `[1, 2, 3, 4, 5, 6, 7, 8, 9]`, Target: `9`
* **Output**: `8` (Index of `9`)

---

### **2. 🔢 Find the Missing Number (Sum and XOR)**

#### 📖 **Concept: The Sherlock Holmes 🕵️**

* **Sum Approach**: Total sum of first `n` numbers - actual sum of array = missing number.
* **XOR Approach**: XOR all numbers in range `[1...n]` with array elements to find the missing one.

#### 🛠 **Code**

```java
public class MissNumber1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = numbers.length + 1; // Total numbers including the missing one

        // Using Sum-based Approach
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        System.out.println("Missing number (Sum approach): " + (expectedSum - actualSum));

        // Using XOR-based Approach
        int xorFull = 0;
        for (int i = 1; i <= n; i++) {
            xorFull ^= i;
        }

        int xorArray = 0;
        for (int num : numbers) {
            xorArray ^= num;
        }

        System.out.println("Missing number (XOR approach): " + (xorFull ^ xorArray));
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: Array: `[1, 2, 3, 4, 5, 6, 7, 8]`, Range: `1–9`
* **Output**:

  * `Missing number (Sum approach): 9`
  * `Missing number (XOR approach): 9`

---

### **3. 🔄 Reverse a String**

#### 📖 **Concept: Mirror, Mirror on the Wall 🪞**

* Use **StringBuilder** for efficient string reversal.
* Two methods:

  1. Built-in `.reverse()`.
  2. For-loop to append characters in reverse order.

#### 🛠 **Code**

```java
public class Rev {
    public static void main(String[] args) {
        String str = "Hello World!";
        String reverseBuild = new StringBuilder(str).reverse().toString();
        System.out.println(reverseBuild);

        // for loop
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `"Hello World!"`
* **Output**:

  * `"!dlroW olleH"` (Using `.reverse()`)
  * `"!dlroW olleH"` (Using for-loop)

---

### 🎉 **Reflection**

* 🔍 **Binary Search**: Mastered the divide-and-conquer approach.
* 🔢 **Missing Numbers**: Sherlock-level deduction with sum and XOR techniques.
* 🔄 **Reverse Magic**: Two cool ways to flip strings like a pro magician.

Day 67 done and dusted! 🚀 Keep coding and innovating! ✨
Here’s the **README.md for Day 68**, with engaging explanations, emojis, and fun concepts!

---

## 🌟 **Day 68: Unions, Intersections, and Linked List Magic!** 🌟

### 🏆 **Problems Solved**

1. 🔗 **[Find Intersection of Two Arrays](#1-find-intersection-of-two-arrays)**
2. 🔄 **[Reverse a Linked List](#2-reverse-a-linked-list)**

---

### **1. 🔗 Find Intersection of Two Arrays**

#### 📖 **Concept: Set Magic 🧙‍♂️**

* Use sets to efficiently find common elements between two arrays.
* **HashSet** ensures unique elements and makes lookup faster.

#### 🛠 **Code**

```java
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num); // Store nums1 elements in set1
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num); // Add common elements to result
            }
        }

        // Convert the result set to an array
        int[] intersection = new int[result.size()];
        int i = 0;
        for (int num : result) {
            intersection[i++] = num;
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `nums1 = [1, 2, 2, 1]`, `nums2 = [2, 2]`
* **Output**: `2`

#### 🌟 **Learning Moment:**

Sets simplify operations by removing duplicates and providing constant time complexity for lookups!

---

### **2. 🔄 Reverse a Linked List**

#### 📖 **Concept: Pointers Dance 💃**

* Reversing a linked list means flipping the direction of all `next` pointers.
* Use a **prev**, **current**, and **nextTemp** pointer to safely reverse without losing connections.

#### 🛠 **Code**

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next; // Store next node
            current.next = prev;             // Reverse current node's pointer
            prev = current;                  // Move prev forward
            current = nextTemp;              // Move current forward
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversed = reverseList(head);

        while (reversed != null) {
            System.out.print(reversed.val + " -> ");
            reversed = reversed.next;
        }
        System.out.print("NULL");
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `1 -> 2 -> 3 -> 4 -> 5 -> NULL`
* **Output**: `5 -> 4 -> 3 -> 2 -> 1 -> NULL`

#### 🌟 **Learning Moment:**

Pointers make reversing linked lists intuitive! Think of **prev**, **current**, and **next** as dancers shifting positions. 💃

---

### 🎉 **Reflection**

* 🔗 **Array Intersection**: Sets are your friends when working with unique elements and intersections!
* 🔄 **Linked List Reversal**: Mastered pointer manipulation for reversing.

Day 68 is conquered! 🥳 Let’s keep leveling up! 🚀
Here’s the **README.md for Day 69**, with fun explanations, emojis, and engaging insights!

---

## 🌟 **Day 69: Thrilling Challenges with Arrays!** 🌟

### 🏆 **Problems Solved**

1. 🔢 **[Kth Largest Element in an Array](#1-kth-largest-element-in-an-array)**
2. 🤝 **[Find Pairs with a Given Sum](#2-find-pairs-with-a-given-sum)**

---

### **1. 🔢 Kth Largest Element in an Array**

#### 📖 **Concept: Divide-and-Conquer with Quick Select 🚀**

* The **Quick Select** algorithm, inspired by Quick Sort, is a powerful way to find the Kth largest/smallest element efficiently.
* It partitions the array around a pivot, reducing the problem size at each step.

#### 🛠 **Code**

```java
import java.util.Random;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(numbers, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }

    private static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, right);

        int partitionIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                swap(nums, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(nums, partitionIndex, right);

        if (partitionIndex == k) return nums[partitionIndex];
        else if (partitionIndex < k) return quickSelect(nums, partitionIndex + 1, right, k);
        else return quickSelect(nums, left, partitionIndex - 1, k);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `numbers = [3, 2, 1, 5, 6, 4]`, `k = 2`
* **Output**: `5`

#### 🌟 **Learning Moment:**

Quick Select reduces the array size logarithmically, making it super efficient for finding top K elements!

---

### **2. 🤝 Find Pairs with a Given Sum**

#### 📖 **Concept: Two’s Company 💕 (HashSet Magic)**

* Use a **HashSet** to keep track of visited elements and their complements.
* This approach ensures an efficient `O(n)` solution.

#### 🛠 **Code**

```java
import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7, 3, 9, 2};
        int targetSum = 10;
        findPairs(numbers, targetSum);
    }

    private static void findPairs(int[] numbers, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `numbers = [1, 4, 6, 7, 3, 9, 2]`, `targetSum = 10`
* **Output**:

  ```
  Pair: (7, 3)
  Pair: (9, 1)
  ```

#### 🌟 **Learning Moment:**

HashSet provides constant-time lookups, making it perfect for finding complements quickly!

---

### 🎉 **Reflection**

* 🔢 **Kth Largest Element**: Mastered the Quick Select algorithm for efficient Kth element retrieval!
* 🤝 **Pair with Sum**: Explored HashSet to find pairs with a given sum efficiently!

Day 69 completed with more array magic! 🪄 Let’s keep building! 🚀
Here’s the **README.md for Day 70** with fun emojis and simple concepts!

---

## 🌟 **Day 70: Exploring Characters and Sorting!** 🌟

### 🏆 **Problems Solved**

1. 🔤 **[First Non-Repeating Character in a String](#1-first-non-repeating-character-in-a-string)**
2. 🔀 **[Merge Two Sorted Arrays In-Place](#2-merge-two-sorted-arrays-in-place)**

---

### **1. 🔤 First Non-Repeating Character in a String**

#### 📖 **Concept: Finding the Quiet One 🔎**

* We use a **LinkedHashMap** to keep track of characters and their counts while maintaining their order of appearance.
* Iterate twice:

  * First to count occurrences.
  * Second to find the first character with a count of 1.

#### 🛠 **Code**

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatingCharacter(input);
        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0; // Return 0 if no non-repeating character is found
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `swiss`
* **Output**: `First non-repeating character: w`

#### 🌟 **Learning Moment:**

LinkedHashMap preserves insertion order, making it perfect for finding the first unique character!

---

### **2. 🔀 Merge Two Sorted Arrays In-Place**

#### 📖 **Concept: Efficient Merge Without Extra Space 🛠**

* Compare elements of two sorted arrays.
* If an element in `arr1` is greater than the smallest element in `arr2`, swap and re-sort `arr2`.
* **No extra space used!**

#### 🛠 **Code**

```java
import java.util.Arrays;

public class MergeSorter {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        merge(arr1, arr2);
        System.out.println("Merged Array 1: " + Arrays.toString(arr1));
        System.out.println("Merged Array 2: " + Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        for (int i = 0; i < m; i++) {
            if (arr1[i] > arr2[0]) {
                // Swap elements
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Re-sort arr2 to maintain order
                int first = arr2[0];
                int k;
                for (k = 1; k < n && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }
}
```

#### 💡 **Example Input/Output**

* **Input**:

  * `arr1 = [1, 3, 5, 7]`
  * `arr2 = [2, 4, 6, 8]`
* **Output**:

  * `Merged Array 1: [1, 2, 3, 4]`
  * `Merged Array 2: [5, 6, 7, 8]`

#### 🌟 **Learning Moment:**

In-place merging eliminates the need for extra memory, ideal for space-constrained problems!

---

### 🎉 **Reflection**

* 🔤 **First Non-Repeating Character**: Leveraged LinkedHashMap for efficient lookup and order retention.
* 🔀 **Merge Arrays In-Place**: Mastered space-efficient techniques for array manipulation.

Day 70: Completed with smarter techniques and efficient coding! 🚀 Keep coding and having fun! 🎯
Here’s the **README.md for Day 71**, with a fun and memorable explanation!

---

## 🌟 **Day 71: Converting Strings to Integers Like a Pro!** 🌟

### 🏆 **Problems Solved**

1. 🔢 **[String to Integer (ATOI) Implementation](#string-to-integer-atoi-implementation)**

---

### 🔢 **String to Integer (ATOI) Implementation**

#### 📖 **Concept: Parsing Strings with Precision 🎯**

The goal is to mimic the `atoi()` function behavior:

1. **Ignore leading whitespace**.
2. **Handle optional sign (`+/-`)**.
3. **Convert valid digits to an integer**.
4. **Handle overflow gracefully**.

#### 🛠 **Code**

```java
public class AToIString {

    public static void main(String[] args) {
        String s = "  -0012g4";
        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {
        int sign = 1, res = 0, idx = 0;

        // Ignore leading whitespace
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }

        // Store the sign
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx++) == '-') {
                sign = -1;
            }
        }

        // Convert digits to a number
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            // Check for overflow/underflow
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = 10 * res + (s.charAt(idx++) - '0'); // Append digit to result
        }

        return res * sign;
    }
}
```

#### 💡 **Example Input/Output**

* **Input**: `"  -0012g4"`
* **Output**: `-12`

#### 🚨 **Key Points**

* **Whitespace Handling**: Ignore leading spaces.
* **Sign Detection**: Detect if the number is negative or positive.
* **Overflow Handling**: Return `Integer.MAX_VALUE` or `Integer.MIN_VALUE` when values exceed the 32-bit range.
* **Character Validation**: Stop processing when encountering non-numeric characters.

---

### 🎉 **Reflection**

* Learned about robust string parsing techniques.
* Implemented checks for overflow and character validation.
* Practiced edge cases like `"  +42"` and `"21474836460"`.


## 🌟 **Day 72: Adding Binary Strings with Elegance!** 🌟

### 🏆 **Problem Solved**

1. 🧮 **[Add Two Binary Strings](#add-two-binary-strings)**

---

### 🧮 **Add Two Binary Strings**

#### 📖 **Concept: Binary Math Fun 💡**

The goal is to simulate binary addition, bit by bit:

* **Align the strings by their lengths.**
* **Add corresponding bits, starting from the rightmost end.**
* **Handle carry efficiently.**
* **Trim leading zeros for clean output.**

#### 🛠 **Code**

```java
public class AddTwoBinaryString {

    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        System.out.println(addBinary(s1, s2));
    }

    public static String addBinary(String s1, String s2) {
        // Trim Leading Zeros
        s1 = trimLeadingZeros(s1);
        s2 = trimLeadingZeros(s2);

        int n = s1.length();
        int m = s2.length();

        // Swap the strings if s1 is smaller
        if (n < m) {
            return addBinary(s2, s1);
        }

        int j = m - 1; // Pointer for s2
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Traverse both strings from the end
        for (int i = n - 1; i >= 0; i--) {
            int bit1 = s1.charAt(i) - '0'; // Current bit of s1
            int sum = bit1 + carry;

            // Add bit from s2 if available
            if (j >= 0) {
                int bit2 = s2.charAt(j) - '0';
                sum += bit2;
                j--;
            }

            // Calculate result bit and update carry
            int bit = sum % 2;
            carry = sum / 2;
            result.append((char) (bit + '0')); // Append result bit
        }

        // If carry remains, append it
        if (carry > 0) {
            result.append('1');
        }

        // Reverse the result for final output
        return result.reverse().toString();
    }

    private static String trimLeadingZeros(String s) {
        // Find the position of the first '1'
        int firstOne = s.indexOf('1');
        return (firstOne == -1) ? "0" : s.substring(firstOne);
    }
}
```

#### 💡 **Example Input/Output**

* **Input**:

  ```java
  s1 = "1101";
  s2 = "111";
  ```
* **Output**:

  ```
  "10100"
  ```

#### 🚨 **Key Insights**

1. **Binary Addition**: Works like decimal addition but modulo 2.
2. **Carry Handling**: Calculate carry and append it to the result.
3. **Leading Zeros**: Trim them to ensure clean outputs.

---

### 🎉 **Reflection**

* Practiced binary addition and string manipulation.
* Learned how to dynamically handle varying input lengths.
* Gained a deeper understanding of carry operations in binary math.

👨‍💻 **Takeaway**: Binary operations are not just zeros and ones—they're opportunities for creative thinking! 🚀

### **Day 73: Advanced Java Stream Operations**

---

### 📚 **Key Topics Explored**

1. **Java Streams**

   * Combining multiple lists into a single list using `flatMap`.
   * Removing duplicates and filtering specific criteria.
   * Grouping elements with their frequencies using `Collectors.groupingBy`.
   * Finding the second highest number in a list.
2. **String Manipulations**

   * Reversing strings using Streams (`Stream` and `IntStream`).

---

### 🛠 **Code Explanation**

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultipleListInSingleListInStream {
    public static void main(String[] args) {
        // Input: Nested lists
        List<List<String>> list = List.of(
                List.of("hello", "world"), 
                List.of("mani", "kandan"),
                List.of("azhagu", "The"), 
                List.of("alagu", "alagu379", "mani", "alagu379")
        );

        // Flattening all sublists into a single list
        System.out.println("Flattened list: " + list.stream().flatMap(l -> l.stream()).toList());

        // Removing duplicates
        List<String> singleList = list.stream()
                                      .flatMap(ls -> ls.stream())
                                      .distinct()
                                      .collect(Collectors.toList());
        System.out.println("Distinct elements: " + singleList);

        // Filtering strings ending with 'u'
        singleList = singleList.stream()
                               .filter(s -> s.endsWith("u"))
                               .collect(Collectors.toList());
        System.out.println("Filtered strings (end with 'u'): " + singleList);

        // Counting occurrences of each string
        Map<String, Long> map = list.stream()
                                    .flatMap(ls -> ls.stream())
                                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Occurrences map: " + map);

        // Finding the second highest value in the array
        List<Integer> n = List.of(1, 3, 45, 56, 78, 8, 8, 8, 9);
        Optional<Integer> max2 = n.stream()
                                  .distinct()
                                  .sorted((x, y) -> y - x)
                                  .skip(1)  // Skip the highest value
                                  .findFirst();
        System.out.println("Second highest value: " + max2.orElse(-1));

        // Reversing a string using Streams
        String str = "Hello world";

        // Using Stream.of() and Collectors.joining()
        String reversedStream = Stream.of(str.split(""))
                                       .sorted((a, b) -> -1) // Sort in reverse order
                                       .collect(Collectors.joining());
        System.out.println("Reversed string (Stream): " + reversedStream);

        // Using IntStream for reversing
        String reversedIntStream = IntStream.range(0, str.length())
                                            .mapToObj(i -> str.charAt(str.length() - i - 1))
                                            .map(String::valueOf)
                                            .collect(Collectors.joining());
        System.out.println("Reversed string (IntStream): " + reversedIntStream);
    }
}
```

---

### 🔍 **Explanation of Each Section**

#### 1. **Flatten and Distinct Elements**

* **`flatMap`**: Combines multiple lists into one single stream.
* **`distinct`**: Removes duplicates from the flattened stream.

#### 2. **Filter Strings Ending with 'u'**

* Uses **`filter`** to include only strings that satisfy the condition `endsWith("u")`.

#### 3. **Count Element Frequencies**

* **`groupingBy`**: Groups elements as keys and counts their occurrences as values.

#### 4. **Find Second Highest Value**

* **`distinct`**: Removes duplicates.
* **`sorted`**: Sorts in descending order using `(x, y) -> y - x`.
* **`skip(1)`**: Skips the first (highest) element.
* **`findFirst`**: Retrieves the second-highest element.

#### 5. **Reverse a String**

* **Using `Stream.of`**: Converts the string into a stream of characters.
* **Using `IntStream`**: Directly manipulates indices to reverse characters.

---

### 🔑 **Key Takeaways**

* **Java Streams** simplify complex list and string operations.
* The `flatMap` method is highly versatile for processing nested structures.
* Streams offer elegant solutions for aggregation, filtering, and transformations.
* String manipulations are more fun with functional programming patterns! 🚀

### **Day 74: Counting Duplicate Characters Using Streams**

---

### 📚 **Key Concepts Covered**

1. **Counting Occurrences in Strings**

   * Uses `Collectors.groupingBy` to count character occurrences.
   * Converts strings into streams for processing.
2. **Filtering Duplicates**

   * Filters characters with more than one occurrence using `filter`.

---

### 🛠 **Code Walkthrough**

```java
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Rev1 {

    public static void main(String[] args) {

        // Input string
        String str = "hello";

        // Count occurrences of each character using Arrays.stream()
        Map<String, Long> countMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println("Count using String split: " + countMap);

        // Count occurrences using chars() and filter duplicates
        Map<Character, Long> countMap1 = str.chars()  // Convert string to IntStream
                .mapToObj(c -> (char) c)  // Convert int to char
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))  // Group and count
                .entrySet()
                .stream()  // Stream the map entries
                .filter(entry -> entry.getValue() > 1)  // Filter for duplicates
                .collect(Collectors.toMap(  // Collect filtered results back to map
                        Map.Entry::getKey,
                        Map.Entry::getValue));
        System.out.println("Filtered duplicates: " + countMap1);
    }
}
```

---

### **Explanation of Key Sections**

#### **1. Counting Characters Using `split`**

* **Logic:** Splits the string into an array of characters (`split("")`).
* **Stream Processing:**

  * **`groupingBy`**: Groups characters.
  * **`counting`**: Counts occurrences of each group.
* **Output:** Produces a map where keys are characters (as `String`) and values are their counts.

**Example Output:**

```plaintext
Count using String split: {e=1, l=2, h=1, o=1}
```

---

#### **2. Counting Characters Using `chars()`**

* **Logic:** Converts the string to an `IntStream` of ASCII values.
* **Key Steps:**

  1. **`mapToObj`**: Converts ASCII values to characters.
  2. **`groupingBy`**: Groups characters and counts occurrences.
  3. **`filter`**: Filters out entries with a count of `1`.
  4. **`collect`**: Collects the filtered entries into a new map.

**Example Output:**

```plaintext
Filtered duplicates: {l=2}
```

---

### **Advantages of Each Approach**

| **Approach** | **Pros**                                  | **Cons**                       |
| ------------ | ----------------------------------------- | ------------------------------ |
| `split("")`  | Simple and straightforward.               | Slower for large strings.      |
| `chars()`    | Efficient for character-based operations. | Requires casting (`mapToObj`). |

---

### 🔑 **Takeaways**

1. **Streams** make character counting and filtering concise.
2. **`chars()`** is a powerful method for character-level manipulations in strings.
3. Filtering and mapping are effective tools for extracting meaningful data.

---

### **Optimizations and Best Practices**

* Use `chars()` for larger strings as it's more memory-efficient.
* Minimize intermediate map creation by chaining operations.

---

### Day-75: Java Programs and Challenges

---


### **Included Programs**

1. **Word Count in a Sentence**

   * Counts the number of words in a sentence using both manual iteration and the `split` method.

2. **Detecting Duplicates in an Array**

   * Identifies duplicates using:

     * `HashSet` for quick lookups.
     * Streams with `distinct()` and `groupingBy()`.

3. **Finding a Missing Number**

   * Finds the missing number in a sequence using the arithmetic sum formula.

4. **Finding Longest Common Prefix**

   * Determines the longest common prefix in an array of strings.

5. **Maximum Subarray Sum**

   * Implements Kadane's algorithm to find the maximum sum of contiguous subarrays.

6. **FizzBuzz**

   * Prints:

     * "Fizz" for multiples of 3.
     * "Buzz" for multiples of 5.
     * "FizzBuzz" for multiples of both.

7. **Palindrome Check**

   * Verifies whether a string is a palindrome using both `StringBuilder` and Stream API.

8. **Palindrome Until Found**

   * Repeatedly adds the digits of a number until it becomes a palindrome.

9. **String Reverse Using Streams**

   * Reverses a string using character sorting with Streams.

---

### **Code Highlights**

#### **1. Word Count in a Sentence**

```java
int count = sentence.trim().split("\\s+").length;
System.out.println(count);
```

#### **2. Detecting Duplicates**

```java
Map<Integer, Long> map = Arrays.stream(arr).boxed()
    .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
System.out.println(map);
```

#### **3. Finding a Missing Number**

```java
int expectedSum = IntStream.rangeClosed(1, n).sum();
int actualSum = numbers.stream().mapToInt(Integer::intValue).sum();
int missingNumber = expectedSum - actualSum;
```

#### **4. Finding Longest Common Prefix**

```java
private static String findComonPrefix(String prefix, String string) {
    int i = 0;
    while (i < prefix.length() && i < string.length() && prefix.charAt(i) == string.charAt(i)) {
        i++;
    }
    return prefix.substring(0, i);
}
```

#### **5. Maximum Subarray Sum**

```java
for (int i = 1; i < nums.length; i++) {
    maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
    maxSoFar = Math.max(maxSoFar, maxEndingHere);
}
```

#### **6. FizzBuzz**

```java
IntStream.rangeClosed(1, 100).mapToObj(i -> {
    if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
    else if (i % 3 == 0) return "Fizz";
    else if (i % 5 == 0) return "Buzz";
    else return String.valueOf(i);
}).forEach(System.out::println);
```

#### **7. Palindrome Check**

```java
boolean isPalindrome = IntStream.range(0, str.length() / 2)
    .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
```

#### **8. Palindrome Until Found**

```java
while (!palindrome(num)) {
    num = addDigits(num);
}
System.out.println("Palindrome found: " + num);
```

#### **9. String Reverse Using Streams**

```java
String rev = str.chars().mapToObj(c -> (char) c)
    .sorted((a, b) -> -1)
    .map(String::valueOf)
    .collect(Collectors.joining());
```

---

### **Concepts Explored**

1. **Streams and Lambdas**

   * Used extensively for operations like filtering, mapping, and grouping.

2. **Iterative Methods**

   * For scenarios requiring more control and custom logic.

3. **Algorithm Optimization**

   * Efficient solutions using Kadane's algorithm and arithmetic sum.

---

### **Execution Instructions**

1. Ensure you have **Java 8+** installed on your system.
2. Compile the Java files:

   ```bash
   javac FileName.java
   ```
3. Run the compiled program:

   ```bash
   java FileName
   ```

---

### **Conclusion**

Day 75 focused on solving classic problems while emphasizing clean code, algorithmic efficiency, and Java's powerful Stream API. 🚀


### Day-76: Efficient Java Solutions with HashSet and HashMap

---

### **What We Did Today**

1. Solved two problems using Java:

   * **Longest Consecutive Sequence**: Find the longest sequence of consecutive numbers in an array.
   * **Count Pairs with Sum**: Count how many pairs of numbers in an array add up to a given target.

2. Used `HashSet` and `HashMap` to make the solutions faster and simpler.

---

### **Programs**

#### **1. Longest Consecutive Sequence**

* **Idea**: Use a `HashSet` to store numbers for quick lookup. Start counting only when a number is the beginning of a sequence (no smaller number exists).

```java
private static int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }

    int longestStreak = 0;

    for (int num : nums) {
        if (!set.contains(num - 1)) { // Start of a sequence
            int currentNum = num;
            int currentStreak = 1;

            while (set.contains(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;
}
```

**Example Input:** `{100, 4, 200, 1, 3, 2}`
**Output:** `4` (Longest sequence: 1, 2, 3, 4)

---

#### **2. Count Pairs with Sum**

* **Idea**: Use a `HashMap` to store how many times each number appears. For every number, check if its complement (target - number) exists in the map.

```java
private static int countPairs(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;

    for (int num : arr) {
        int complement = target - num;

        if (map.containsKey(complement)) {
            count += map.get(complement);
        }

        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    return count;
}
```

**Example Input:** `{1, 5, 7, -1, 5}`, Target = `6`
**Output:** `3` (Pairs: \[1, 5], \[7, -1], \[5, 1])

---

### **Key Concepts**

1. **HashSet**:

   * Perfect for problems where you need to check if a value exists quickly.
   * Example: Finding consecutive numbers.

2. **HashMap**:

   * Great for counting or finding pairs efficiently.
   * Example: Counting pairs with a target sum.

---

### **Why These Solutions Are Good**

* They avoid unnecessary loops, making them much faster (O(n) complexity).
* Simple and easy to understand.

---
### **What’s Next?**

Tomorrow, we’ll explore recursion and advanced problem-solving techniques. Keep coding! 🚀

### Day-77: Problem-Solving with Arrays and Prefix Sums

---

### **Topics Covered**

1. **Trapping Rain Water**: Calculate the total amount of water that can be trapped between bars of different heights.
2. **Subarray with Given Sum**: Find the indices of a subarray whose elements sum up to a given target.

---

### **Programs**

#### **1. Trapping Rain Water**

* **Problem**: Given an array representing bar heights, find how much water can be trapped after rainfall.
* **Approach**: Use two arrays to store the maximum heights to the left and right of each bar. Calculate trapped water using the formula:

  $$
  \text{Trapped Water} = \text{min}(\text{leftMax}[i], \text{rightMax}[i]) - \text{height}[i]
  $$

**Code**:

```java
private static int trapWater(int[] height) {
    if (height == null || height.length == 0) return 0;

    int n = height.length;
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];
    int water = 0;

    // Fill leftMax array
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    }

    // Fill rightMax array
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    }

    // Calculate trapped water
    for (int i = 0; i < n; i++) {
        water += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return water;
}
```

**Example Input**: `{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}`
**Output**: `6`

---

#### **2. Subarray with Given Sum**

* **Problem**: Given an array and a target sum, find the start and end indices of a subarray that sums up to the target.
* **Approach**: Use a `HashMap` to store prefix sums. For each element, calculate the current sum and check if the complement (`currentSum - target`) exists in the map.

**Code**:

```java
private static int[] findSubarray(int[] arr, int target) {
    HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
    int currentSum = 0;

    for (int i = 0; i < arr.length; i++) {
        currentSum += arr[i];

        if (currentSum == target) {
            return new int[]{0, i};
        }

        if (prefixSumMap.containsKey(currentSum - target)) {
            return new int[]{prefixSumMap.get(currentSum - target) + 1, i};
        }

        prefixSumMap.put(currentSum, i);
    }

    return new int[0]; // Return empty array if no subarray is found
}
```

**Example Input**:
Array: `{1, 2, 3, 7, 5}`, Target = `12`
**Output**: `Subarray indices: [1, 3]` (Subarray: `{2, 3, 7}`)

---

### **Key Concepts**

1. **Left and Right Max Arrays**:

   * Useful for range-based calculations like trapping water.
   * Help to avoid nested loops, improving efficiency.

2. **Prefix Sums with HashMap**:

   * Tracks cumulative sums for quick lookups.
   * Handles negative and positive numbers efficiently.

---

### **Complexity Analysis**

| Problem                 | Time Complexity | Space Complexity |
| ----------------------- | --------------- | ---------------- |
| Trapping Rain Water     | $O(n)$          | $O(n)$           |
| Subarray with Given Sum | $O(n)$          | $O(n)$           |

---
### **What’s Next?**

Tomorrow, we will dive into sorting-based problems and dynamic programming challenges. Stay tuned! 😊



### 🌟 Day 78: Swap Strings Without Temp Variable

#### **📝 Problem**

Swap two strings without using a temporary variable.

---

#### **💻 Code**

```java
public class SwapString {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

        // Combine both strings
        s1 = s1 + s2;

        // Extract original s1 and assign it to s2
        s2 = s1.substring(0, s1.length() - s2.length());

        // Extract original s2 and assign it to s1
        s1 = s1.substring(s2.length(), s1.length());

        // Print the swapped strings
        System.out.println(s2 + "  " + s1);
    }
}
```

---

#### **📚 Explanation**

1. **Combine Strings**:

   * `s1 = s1 + s2;` ➡️ Combines `s1` and `s2` into one: `"helloworld"`.

2. **Extract First Part**:

   * `s2 = s1.substring(0, s1.length() - s2.length());` ➡️ Extracts `"hello"` and assigns it to `s2`.

3. **Extract Second Part**:

   * `s1 = s1.substring(s2.length(), s1.length());` ➡️ Extracts `"world"` and assigns it to `s1`.

4. **Result**:

   * Swapped values are printed: `"world  hello"`.

---

#### **🔍 Output**

```
world  hello
```

---

#### **✨ Key Points**

* 🚀 No temporary variable used.
* 🛠️ String operations like concatenation and `substring` make swapping possible.

