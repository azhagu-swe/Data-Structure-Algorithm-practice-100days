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

