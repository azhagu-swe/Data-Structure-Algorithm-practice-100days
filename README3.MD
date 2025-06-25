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
