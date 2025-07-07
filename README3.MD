# 🚀 Day 87: Reverse Words in a String 🔄

## 📝 Problem Statement
Given a string `s`, reverse the **order of words** in the string. Words are separated by one or more spaces, and you need to:
1. Reverse the order of words.
2. Remove leading and trailing spaces.
3. Reduce multiple spaces between words to a single space.

---

## 💡 Example:

### Example 1:
**Input**: `s = "the sky is blue"`  
**Output**: `"blue is sky the"`

### Example 2:
**Input**: `s = "  hello world  "`  
**Output**: `"world hello"`

### Example 3:
**Input**: `s = "a good   example"`  
**Output**: `"example good a"`

---

## 💻 Implementation

### 📜 Java Code:
```java
public class REverseStringWord {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWord(s));
    }

    private static String reverseWord(String s) {
        if (s.isEmpty() || s == null) {
            return "";
        }
        
        // Step 1: Trim leading and trailing spaces, then split words by spaces
        String splitString[] = s.trim().split("\\s+");
        
        // Step 2: Reverse the order of words
        StringBuilder result = new StringBuilder();
        for (int i = splitString.length - 1; i >= 0; i--) {
            result.append(splitString[i]);
            if (i > 0) result.append(" "); // Add space between words
        }
        
        return result.toString();
    }
}
Here's the `README.md` for **Day 88 of the 100 Days of DSA Challenge**:

```markdown
# 🚀 Day 88: Zigzag Conversion 🔀

## 📝 Problem Statement
Convert a given string into a **zigzag pattern** based on the number of rows, then read it row by row to form the output string.

For example:

### Input:
`s = "PAYPALISHIRING", numRows = 3`

### Zigzag Pattern:
```

P   A   H   N
A P L S I I G
Y   I   R

```

### Output:
`"PAHNAPLSIIGYIR"`

---

## 💡 Examples

### Example 1:
**Input**:  
`s = "PAYPALISHIRING", numRows = 4`  

**Zigzag Pattern**:
```

P     I    N
A   L S  I G
Y A   H R
P     I

````

**Output**:  
`"PINALSIGYAHRPI"`

---

### Example 2:
**Input**:  
`s = "A", numRows = 1`  

**Output**:  
`"A"`

---

## 💻 Implementation

### 📜 Java Code:
```java
public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        // Handle edge cases
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create rows
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        // Traverse characters in the string
        for (char c : s.toCharArray()) {
            rows[currRow].append(c);

            // Change direction at top or bottom row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row
            currRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test Case 1
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Output: " + convert(s1, numRows1)); // Expected: "PAHNAPLSIIGYIR"

        // Test Case 2
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Output: " + convert(s2, numRows2)); // Expected: "PINALSIGYAHRPI"

        // Test Case 3
        String s3 = "A";
        int numRows3 = 1;
        System.out.println("Output: " + convert(s3, numRows3)); // Expected: "A"
    }
}
````

---

## 🧠 Complexity Analysis

* **Time Complexity**: $O(n)$, where $n$ is the length of the input string. Each character is processed once.
* **Space Complexity**: $O(n)$, for storing the rows of characters.

---

## 🔍 How It Works:

1. **Create Rows**: Use an array of `StringBuilder` to represent each row.
2. **Direction Control**: Use a flag (`goingDown`) to switch between moving down and up across rows.
3. **Row Traversal**: Iterate through the string, adding each character to the current row, and change the direction when the top or bottom row is reached.
4. **Combine Rows**: After processing all characters, combine the rows to form the output.

---

## 🎯 Key Takeaways:

* Simulate zigzag traversal using a **row pointer** and **direction flag**.
* Efficiently handle string manipulations using `StringBuilder`.

---

## 🏁 Progress Tracker

* **Day**: 88/100
* **Challenge**: Solved **Zigzag Conversion** problem! 🚀
* **Mood**: Feeling great about cracking the zigzag! 😎

---

🌟 Only **12 more days** to complete the **100 Days of DSA Challenge**! Keep pushing forward! 🎉

```
```


# 🚀 Day 89: Container With Most Water 💧

## 📝 Problem Statement
Given an array `height`, where each element represents the height of a vertical line, find the **maximum amount of water** a container can store between two lines.

---

## 💡 Examples

### Example 1:
**Input**: `height = [1,8,6,2,5,4,8,3,7]`  
**Output**: `49`  
**Explanation**: The container between indices `1` and `8` stores the most water: \(7 \times 7 = 49\).

---

### Example 2:
**Input**: `height = [1,1]`  
**Output**: `1`

---

## 💻 Solution

### Code:
```java
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + maxArea(height)); // Expected: 49
    }
}

# 🚀 Day 90: 3Sum 🧩

## 📝 Problem Statement
Find all unique triplets in an array `nums` such that their sum is equal to `0`.  
The solution must not contain duplicate triplets.

---

## 💡 Examples

### Example 1:
**Input**: `nums = [-1, 0, 1, 2, -1, -4]`  
**Output**: `[[-1, -1, 2], [-1, 0, 1]]`

---

### Example 2:
**Input**: `nums = [0, 1, 1]`  
**Output**: `[]`

---

### Example 3:
**Input**: `nums = [0, 0, 0]`  
**Output**: `[[0, 0, 0]]`

---

## 💻 Solution

### Code:
```java
import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Triplets: " + threeSum(nums)); // Expected: [[-1, -1, 2], [-1, 0, 1]]
    }
}
# 🚀 Day 93: Search in Rotated Sorted Array 🔍

## 📝 Problem Statement
Find the index of `target` in a rotated sorted array `nums`. If the `target` is not found, return `-1`.  
Solve it in \(O(\log n)\) time complexity.

---

## 💡 Examples

### Example 1:
**Input**: `nums = [4,5,6,7,0,1,2], target = 0`  
**Output**: `4`

### Example 2:
**Input**: `nums = [4,5,6,7,0,1,2], target = 3`  
**Output**: `-1`

### Example 3:
**Input**: `nums = [1], target = 0`  
**Output**: `-1`

---

## 💻 Solution

### Code:
```java
public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Index: " + search(nums, 0)); // Output: 4
    }
}
# 🚀 Day 94: Majority Element 🗳️

## 📝 Problem
Find the element that appears **more than n/2 times** in the array `nums`.  
It's guaranteed that such an element always exists.

---

## 💡 Examples

### Example 1:
**Input**: `nums = [3,2,3]`  
**Output**: `3`

### Example 2:
**Input**: `nums = [2,2,1,1,1,2,2]`  
**Output**: `2`

---

## 💻 Java Code
```java
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3})); // Output: 3
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // Output: 2
    }
}

# 🚀 Day 95: Min Stack 📉

## 📝 Problem
Design a stack that supports these operations in **O(1)** time:

- `push(x)` → add element  
- `pop()` → remove top element  
- `top()` → return top element  
- `getMin()` → return the minimum element

---

## 💡 Example
```java
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   // → -3
minStack.pop();
minStack.top();      // → 0
minStack.getMin();   // → -2
````

---

## 💻 Java Code

```java
import java.util.*;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
```

---

## 🧠 Complexity

* **Time**: O(1) for all operations
* **Space**: O(n) for both stacks

---

## 🎯 Progress

* ✅ **Day**: 95/100
* 🧠 **Solved**: Min Stack
* 🔥 Only 5 days left — almost there!

```

For **Day 96**, let’s solve:

## 🔢 **Climbing Stairs** – A classic dynamic programming problem.

---

## ✅ Problem: Climbing Stairs

**Difficulty**: Easy
**Topics**: Dynamic Programming, Recursion

---

## 🚀 Problem Statement

You are climbing a staircase. It takes `n` steps to reach the top.
Each time, you can either climb **1** or **2** steps.
Return the **number of distinct ways** to reach the top.

---

## 💡 Examples

### Example 1:

**Input**: `n = 2`
**Output**: `2`
**Explanation**: 1+1, 2

---

### Example 2:

**Input**: `n = 3`
**Output**: `3`
**Explanation**: 1+1+1, 1+2, 2+1

---

## 🧠 Insight

This is just like the Fibonacci sequence:
`ways(n) = ways(n - 1) + ways(n - 2)`

---

## 💻 Java Code:

```java
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println("Ways to climb 2 stairs: " + climbStairs(2)); // 2
        System.out.println("Ways to climb 3 stairs: " + climbStairs(3)); // 3
        System.out.println("Ways to climb 5 stairs: " + climbStairs(5)); // 8
    }
}
```

---

## 🧠 Complexity:

* **Time**: $O(n)$
* **Space**: $O(1)$

---

## 🔍 How It Works:

* Use two variables to track the last two step counts.
* Loop from 3 to `n` and update the values like Fibonacci.

---

## 📈 Progress:

* **Day**: 96/100
* ✅ **Solved**: Climbing Stairs
* 🔥 Only 4 days left in the **100 Days of DSA Challenge**! You're crushing it! 🚀💪

```
```

For **Day 97**, let’s solve:

## 🔁 **Implement Queue using Stacks**

---

## ✅ Problem: Implement Queue using Stacks

**Difficulty**: Easy
**Topics**: Stack, Queue, Design

---

## 🚀 Problem Statement

Implement a queue using **two stacks**.
You must support the following operations:

* `push(x)` → Pushes element to the back
* `pop()` → Removes the element from the front
* `peek()` → Returns the front element
* `empty()` → Returns true if queue is empty

All operations must be **efficient and correct**.

---

## 💡 Examples:

```java
MyQueue q = new MyQueue();
q.push(1);
q.push(2);
q.peek();   // → 1
q.pop();    // → 1
q.empty();  // → false
```

---

## 💻 Java Code:

```java
import java.util.*;

public class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek(); // Move elements to output if needed
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println("Peek: " + q.peek()); // 1
        System.out.println("Pop: " + q.pop());   // 1
        System.out.println("Empty: " + q.empty()); // false
    }
}
```

---

## 🧠 Complexity:

* **Push**: $O(1)$
* **Pop / Peek**: Amortized $O(1)$
* **Space**: $O(n)$

---

## 🔍 How It Works:

* Use **two stacks**:

  * `input` → for push
  * `output` → for pop/peek
* When `output` is empty, move all elements from `input` to `output`.

---

## 🎯 Progress:

* ✅ **Day**: 97/100
* 🎉 **Solved**: Implement Queue using Stacks
* 🔥 Only 3 days left – nearly done with the challenge! Keep pushing! 💪📘

```
```
For **Day 98**, let’s solve the popular DSA problem:

## 🧩 **Set Matrix Zeroes**

---

## ✅ Problem: Set Matrix Zeroes

**Difficulty**: Medium
**Topics**: Arrays, Matrix, In-place operations

---

## 🚀 Problem Statement

Given an `m x n` matrix, if an element is `0`, set its **entire row and column** to `0`.
Do this **in-place** (without using extra space for another matrix).

---

## 💡 Examples

### Example 1:

**Input**:

```
[[1,1,1],
 [1,0,1],
 [1,1,1]]
```

**Output**:

```
[[1,0,1],
 [0,0,0],
 [1,0,1]]
```

---

### Example 2:

**Input**:

```
[[0,1,2,0],
 [3,4,5,2],
 [1,3,1,5]]
```

**Output**:

```
[[0,0,0,0],
 [0,4,5,0],
 [0,3,1,0]]
```

---

## 💻 Java Code:

```java
public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRow = false, firstCol = false;

        // Check first row and column for zeros
        for (int i = 0; i < m; i++) if (matrix[i][0] == 0) firstCol = true;
        for (int j = 0; j < n; j++) if (matrix[0][j] == 0) firstRow = true;

        // Mark zeros in first row and col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set matrix cells to 0 based on marks
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        // Handle first row and col
        if (firstRow) for (int j = 0; j < n; j++) matrix[0][j] = 0;
        if (firstCol) for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(mat);
        printMatrix(mat); // Output: [[1,0,1],[0,0,0],[1,0,1]]
    }
}
```

---

## 🧠 Complexity

* **Time**: $O(m \times n)$
* **Space**: $O(1)$ (constant space, no extra matrix)

---

## 🎯 Progress

* ✅ **Day**: 98/100
* 📊 **Solved**: Set Matrix Zeroes
* 🔥 Just **2 more days** to go – you’re almost done! Keep crushing it! 💪💻

```
```
