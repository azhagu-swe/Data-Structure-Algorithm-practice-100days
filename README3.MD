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
