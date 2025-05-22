```

```

```

```

# 100 Days of DSA Challenges

Welcome! I'm embarking on a 100-day journey to sharpen my Data Structures and Algorithms skills. The goal is simple: solve problems daily, find smarter solutions, and become a more efficient coder.

---

📅 **Day -1: Laying the Foundation (Number Problems)**

**Date:** [02/04/2025]

✅ **Today's Focus: Number Manipulation & Logic**

I kicked things off by tackling 10 problems centered around numbers. This helped refresh core mathematical concepts and basic programming logic.

📌 **Problems Solved & Key Concepts:**

1. **Odd or Even:**

   - **Task:** Determine if a number is odd or even.
   - **Concept:** Basic modulo (`%`) operation.
   - **Optimization:** Used the bitwise AND trick (`num & 1 == 1` for odd) which is often faster.
2. **Leap Year Checker:**

   - **Task:** Validate if a year is a leap year.
   - **Concept:** Applying multiple conditional logic rules (divisible by 4, not by 100 unless also by 400).
   - **Optimization:** Structured the `if-else` conditions efficiently.
3. **Reverse and Digit Extractor:**

   - **Task:** Reverse a number, extract its digits, and sum digits/prime digits.
   - **Concept:** Integer arithmetic (`% 10` to get the last digit, `/ 10` to remove it), looping, and using arrays/lists to store digits.
4. **Duck Number:**

   - **Task:** Check if a number contains a '0' but doesn't start with '0'.
   - **Concept:** Number/string traversal, conditional checks within a loop.
   - **Optimization:** Stopped the check as soon as a '0' was found (after ensuring it's not the leading digit).
5. **Palindrome Number:**

   - **Task:** Check if a number reads the same forwards and backward.
   - **Concept:** Reversing a number using arithmetic and comparing it with the original.
   - **Optimization:** Built the reversed number efficiently within a `while` loop.
6. **Fibonacci Series:**

   - **Task:** Generate the Fibonacci sequence up to `n` terms.
   - **Concept:** Understanding recursive patterns and iterative approaches.
   - **Key Insight:** Compared iterative (using loops, generally more efficient space/time-wise for simple cases) vs. recursive solutions.
7. **Niven Number (Harshad Number):**

   - **Task:** Check if a number is divisible by the sum of its digits.
   - **Concept:** Digit extraction and summation, followed by a divisibility check.
8. **Special Number:**

   - **Task:** Check if (sum of digits) + (product of digits) equals the original number.
   - **Concept:** Digit manipulation involving both sum and product calculations.
   - **Improvement:** Corrected logical flaws in the initial implementation.
9. **Prime Number Printer:**

   - **Task:** Print all prime numbers within a given range.
   - **Concept:** Primality testing.
   - **Optimization:** Implemented the **Sieve of Eratosthenes**, a highly efficient algorithm for finding primes up to a certain limit.
10. **Perfect Number:**

    - **Task:** Check if a number equals the sum of its proper divisors.
    - **Concept:** Finding all divisors of a number.
    - **Optimization:** Calculated the sum of divisors efficiently by looping only up to the square root of the number (`O(√N)` complexity).

🏆 **Key Takeaways from Day -1:**

- **Optimize Wisely:** Simple tricks (like bitwise AND for even/odd) can boost performance. Know when to use them!
- **Number Theory Basics:** Divisibility rules, digit manipulation, and prime properties are fundamental tools.
- **Plan Before Coding:** Breaking down problems logically (e.g., how to extract digits, how to check divisibility) makes coding smoother.
- **Iterative vs. Recursive:** Understand the trade-offs, especially for sequences like Fibonacci. Iteration often saves memory/stack space.
- **Efficient Algorithms Exist:** For common tasks like finding primes (Sieve) or divisors (√N loop), standard optimized algorithms are much better than naive approaches.
- **Momentum Matters:** Even this initial session feels like a great start!

🚀 **Plan for Day 0:**

- Dive into **Bit Manipulation** problems for more low-level optimization techniques.
- Begin tackling fundamental **Array-based** DSA problems.
- Continue exploring the efficiency differences between **Recursion and Iteration**.

📌 **How to Follow My Progress:**

- 📂 **Daily Logs:** Check this repository for daily updates.
- 📝 **Code & Explanations:** Solutions will include clear logic and optimization notes.
- 📢 **Shared Learnings:** I'll highlight key insights and techniques regularly.

Stay tuned for Day 0! Let's conquer DSA together! 💻🔥🚀

## 📅 Day 2: Strings Galore! ✨

**📆 Date:** _[03/04/2025]_

### ✅ What I Solved Today

Today, I tackled **String-based challenges** that deepened my understanding of string manipulation, logic, and optimization. Here's what I accomplished:

---

### 1️⃣ Reverse String 🔄

**💡 Logic:**

- **Goal:** Reverse a given sentence or word.
- **Method:** Manually print the string in reverse order without storing extra copies.
- **Key Condition:** Iterate from the end of the string to the beginning.

_Example:_
Imagine a sentence "Hello World" – by printing characters from the last index to the first, the result is "dlroW olleH".

---

### 2️⃣ Count Words 🔠

**💡 Logic:**

- **Goal:** Count the number of words in a sentence.
- **Method:** First, trim the sentence to remove any extra spaces, then split the sentence using whitespace as the delimiter.
- **Key Condition:** If the sentence is empty or contains only spaces, the count should be 0.

_Example:_
For the sentence " This is a test ", trimming removes extra spaces and splitting yields 4 words.

---

### 3️⃣ Check if String Ends With Another String 🔚

**💡 Logic:**

- **Goal:** Determine if one string ends with another string.
- **Method:** Compare the ending segment of the main string with the target string.
- **Key Condition:** The target string's length must not exceed the main string's length, and each corresponding character must match.

_Example:_
For "Hello World" and "World", comparing the last five characters shows a match, so the condition is true.

---

### 4️⃣ Find Max Occurrence of a Character 🔢

**💡 Logic:**

- **Goal:** Identify the character that appears most frequently in a sentence or word.
- **Method:** Use an array (of size 256 for extended ASCII) to count the frequency of each character, then determine which character has the highest count.
- **Key Condition:** Handle empty input by returning a default character, such as a space.

_Example:_
In the sentence "programming", the character 'g' might occur the most times, making it the maximum occurrence character.

---

## 🏆 Learnings & Observations 🎓

✔ **Memory Efficiency:**

- Manual methods, like in-place printing, help reduce extra memory allocation.
- Utilizing built-in functions for splitting strings can greatly improve both readability and performance.

✔ **Condition Checks:**

- Always validate input, for example, checking if a string is empty before processing.
- Ensure comparisons are made only on the necessary segments of the string (as in the "ends with" challenge).

✔ **Optimization is Key:**

- Small tweaks (such as using a two-pointer approach) significantly enhance performance.
- Breaking down problems into logical steps makes the solution easier to understand and remember.

---

---

## 📅 Day -3: Advanced String Practice

**Date:04/04/2025**

### ✅ What I Accomplished Today

Explored more **advanced string manipulation problems** and practiced optimization using primitive data structures like arrays and direct character operations.

### 📌 Problems Solved

1️⃣ **Check Word 'Gold' in Sentence (Multiple Ways):**

- ✅ Manual loop comparison method to check if "gold" exists as a substring.
- ✅ Regex using `<span>\bgold\b</span>` to detect "gold" as a whole word.
- ✅ Regex using `<span>Pattern.compile("gold")</span>` for case-insensitive match anywhere.

**Example:**

- Input: "The golden goose is priceless"
- Output: ✔ Contains "gold"

2️⃣ **Frequency-Based String Compression:**

- Counted all character frequencies (a-z) and printed them in `<span>char + count</span>` format.
- Used a simple `<span>int[26]</span>` array for optimized performance.

**Example:**

- Input: "aaabbccaaa"
- Output: `<span>a6b2c2</span>`

## 📅 Day 4: String Utilities Mastered 🛠️

**📆 Date:\***[05/04/2025]\*

### ✅ What I Solved Today

1️⃣ **Toggle Each Character Case** 🔄

- **Logic:** For each character, check if it’s lowercase (`<span>'a'</span>`–`<span>'z'</span>`) or uppercase (`<span>'A'</span>`–`<span>'Z'</span>`) and flip by arithmetic:
  - Lower → Upper: `<span>c - 'a' + 'A'</span>`
  - Upper → Lower: `<span>c - 'A' + 'a'</span>`
- **Example:** Input: `<span>"Java123"</span>` → Output: `<span>"jAVA123"</span>`

2️⃣ **Check Anagram** 🧩

- **Logic:** Remove spaces, normalize case, then use a **frequency count** (`<span>int[26]</span>`) to increment for one string and decrement for the other. If all counts return to zero, they are anagrams.
- **Example:**`<span>"listen"</span>`, `<span>"silent"</span>` → Perfectly matched!

3️⃣ **Count Vowels & Consonants** 🔡

- **Logic:** Use a **boolean[26]** lookup for vowels (`<span>a, e, i, o, u</span>`). For each character, if `<span>a</span>`–`<span>z</span>`, check lookup; increment vowel or consonant counter.
- **Example:** Input: `<span>"Hello World"</span>` → Vowels: 3, Consonants: 7

---

_Let's master DSA, one day at a time!_ 🚀💪

## 📅 Day -5: More String Logic 🔠

**📆 Date:\***[06/04/2025]\*

### ✅ What I Solved Today

1️⃣ **Check Pangram:**

- Verified if a sentence contains every letter of the alphabet (a-z).
- Used a `<span>boolean[26]</span>` array to track occurrences.
- Simple logic: if all positions are `<span>true</span>`, it's a pangram.

2️⃣ **Remove Consecutive Duplicates:**

- Input: "aaabbcccdee"
- Output: "abcde"
- Tracked the previous character using primitive `<span>char</span>`.
- Used `<span>StringBuilder</span>` to build the final result efficiently.

---

## 📅 Day-6: String Challenges

**Date:\***[07/04/2025]\*

### ✅ What I Solved Today

1️⃣ **Valid Parentheses Matcher**

- Input: A string of characters.
- Task: Check if all `<span>(</span>` have a matching `<span>)</span>` and vice versa.
- Output: Print `<span>0</span>` if valid, `<span>1</span>` if invalid.
- 🔍 Focus: Balance of opening/closing brackets.

2️⃣ **Character-Number Expansion**

- Input: A compressed string like `<span>a1b10</span>`.
- Task: Expand it to full form like `<span>abbbbbbbbbb</span>`.
- ✅ Approach: Parse characters and use count to repeat.
- 💡 Optimized using `<span>StringBuilder</span>` and primitive data types.

### 🌟 Learnings

✔ Practiced real-world string validation scenarios.
✔ Used ASCII index mapping and parsing techniques.
✔ Solidified character handling logic.

✔ **Regex vs Manual Checks:** Regex is clean but understanding manual loops gives more control.
✔ **Frequency Arrays Rock:** For a-z, `<span>int[26]</span>` is perfect. Fast and easy to use.
✔ **Always Optimize Memory:** Use primitives and `<span>StringBuilder</span>` over string concatenation.

## 📅 Day -7: Solving Advanced String Problems

**Date:\***[08/04/2025]\*

### ✅ What I Accomplished Today

#### 1. **Longest Palindromic Substring**

- **Problem**: Find the longest palindromic substring in a given string.
- **Approach**:
  - Used the **expand around center** technique to identify palindromes by expanding outwards from each character or pair of characters.
  - Compared the lengths of discovered palindromes to find the longest one.
- **Key Learning**:
  - The center expansion approach is efficient with a time complexity of .
  - Debugging palindrome boundaries helped strengthen my understanding of two-pointer algorithms.

#### 2. **Group Anagrams**

- **Problem**: Group a list of strings into groups of anagrams.
- **Approach**:
  - Sorted each string to derive its canonical form (a common key for anagrams).
  - Used a `<span>HashMap</span>` to group words sharing the same canonical form.
  - Collected all groups into a list of lists for the final output.
- **Key Learning**:
  - Sorting and hashing are powerful tools for solving problems involving string patterns.
  - Leveraging `<span>HashMap</span>` for grouping is both efficient and intuitive.

---

### 🏆 Learnings & Observations

1. **Optimized Techniques**:
   - Expand around center for palindromes reduces complexity compared to brute force methods.
   - Sorting strings to identify patterns is a versatile strategy in string problems.
2. **Data Structures**:
   - Used `<span>HashMap</span>` effectively for grouping similar items.
   - Practiced handling edge cases in string-based problems.
3. **Debugging**:
   - Careful consideration of boundaries and indices was crucial, especially in palindromic substring detection.

# 📅Day-8: String Manipulation Challenges

**Date:\***[09/04/2025]\*

## Problems Solved

### 1️⃣ Reverse Words in a String

- **Problem** : Reverse the order of words in a given string while preserving the word order.
- **Key Learning** : Practiced splitting strings and reversing arrays for efficient word reordering.

### 2️⃣ First Non-Repeating Character

- **Problem** : Identify the first non-repeating character in a string. If all characters repeat, return `-1`.
- **Key Learning** : Reinforced understanding of character frequency counts and order tracking in strings.

---

**Summary** : Focused on core string operations such as splitting, reversing, and tracking character occurrences. These problems enhanced logical thinking and problem-solving efficiency for string manipulation tasks.

**Status** : ✅ Completed and Ready for Day-9 Challenges!

# 📅Day 9: Solved Problems

**Date:\***[10/04/2025]\*

## Problems Solved

### Problem 1: First Non-Repeating Character

- **Description** : Given a string, find the first non-repeating character. If all characters repeat, return `null`.
- **Example** :
- Input: "zoho"
- Output: `z`

### Problem 2: Convert String to Title Case

- **Description** : Convert a sentence to title case where the first letter of each word is capitalized, and the rest are in lowercase.
- **Example** :
- Input: "hello world"
- Output: "Hello World"

---

Two problems successfully solved focusing on string manipulation and practical text formatting. Ready for more challenges!

---

# 📅Day-10: Frequency & Water Trapping Challenges

**Date:** _[11/04/2025]_

---

## Problems Solved Today

### 1. Character Frequency Counter

- **Description:**Count the frequency of each character in a given string and output the result as a mapping from characters to their counts.
- **Key Concepts:**
  - Use of primitive loops and a `HashMap` for frequency counting.
  - Iterating over a string with `toCharArray()`.
  - Efficient use of `getOrDefault()` to simplify counting.
- **Example:**
  - Input: `"hello world"`
  - Output: A map showing counts (e.g., `{h=1, e=1, l=3, o=2, ' '=1, w=1, r=1, d=1}`)

---

### 2. Trapping Rain Water

- **Description:**Given an array representing bar heights in a histogram, determine the total amount of water that can be trapped after raining.
- **Key Concepts:**
  - Two-pointer technique: one pointer starting at the beginning, the other at the end.
  - Maintaining `leftMax` and `rightMax` to determine water level at each bar.
  - Calculating water trapped at each position by comparing the current bar with the maximum seen so far.
- **Example:**
  - Input: `[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]`
  - Output: `6`

---

## Learnings & Observations

- **Efficiency with HashMaps:**Counting characters using a `HashMap` is straightforward and effective for frequency analysis.
- **Two-Pointer Optimization:**The trapping rain water solution showcases how the two-pointer method can lead to a time complexity of O(n) with O(1) extra space.
- **Practical Application:**
  These problems reinforce key concepts such as efficient data traversal, dynamic updates (e.g., updating max values on the fly), and careful handling of edge cases.

---

_Day-10 complete! Ready to tackle more challenges tomorrow!_

# 📅Day 11: Progress and Learning 🚀

**Date:** _[12/04/2025]_

## Problems Solved

### 1. String Permutations

- **Task**: Generate all permutations of a given string.
- **Key Points**:
  - Use recursion and backtracking.
  - Swap characters to form new arrangements.
- **Motivational Note**: Every permutation is a new possibility. Just like in life, rearranging our perspectives can reveal unexpected solutions.

### 2. Unique Characters Check

- **Task**: Check if a string contains all unique characters.
- **Key Points**:
  - Use a HashSet to track characters.
  - Return false if any character repeats; otherwise, return true.
- **Motivational Note**: Uniqueness is your strength! Embrace your individuality and let each unique character represent a part of your brilliance.

---

Keep pushing forward! Every challenge you conquer brings you one step closer to mastering DSA. Your dedication and perseverance are your greatest assets—small consistent steps lead to great success. Let's crush Day 11 and move on to even greater challenges!

# 📅 Day 12: Solved Problems

**Date:** _[13/04/2025]_

## Problems Solved

### Problem 1: Inverted Right-Angled Triangle

- **Description**: Print an inverted triangle of stars, decreasing the number of stars in each row.

### Problem 2: Right-Angled Triangle

- **Description**: Print a triangle of stars, increasing the number of stars in each row.

---

# Solved two pattern-printing problems using nested loops. Ready for the next set of challenges

# 📅Day-13: Advanced Jump Game Challenges

**Date:** _[14/04/2025]_

## Problems Solved Today

### Problem 1: Jump Game II

- **Description**:Given an array of non-negative integers where each element represents the maximum jump length from that index, determine the minimum number of jumps needed to reach the last index.
- **Key Concepts**:
  - Greedy approach with two pointers
  - Tracking the farthest reachable index
  - Incrementing jump count when the current reachable range is exhausted
- **Example**:
  For the array `[2,3,1,1,4]`, the minimum number of jumps is `2`.

---

### Problem 2: Jump Game I

- **Description**:Given an array of non-negative integers where each element represents the maximum jump length from that index, determine if you can reach the last index. Return `true` if possible; otherwise, return `false`.
- **Key Concepts**:
  - Greedy strategy to track the maximum reachable index
  - Early termination if the current index exceeds the farthest reachable index
- **Example**:
  For the array `[2,3,1,1,4]`, you can reach the end (output: `true`).
  For the array `[3,2,1,0,4]`, you cannot reach the end (output: `false`).

---

Focused on advanced jump game variations today, applying greedy techniques to optimize array traversal and decision-making. Ready for the next challenge!

# 🌟 Day 14: Solved Problems (April 15, 2025)

## 🚀 Problems Solved

### 1️⃣ Power Calculation Using Recursion

- **Description**: Compute the power of a base using recursion.
- **Example**:
  - **Input**: base = 2, power = 3
  - **Output**: `8`

---

### 2️⃣ Find Middle of the String

- **Description**: Find and return the middle character(s) of a string.
  - If the string length is odd, return the single middle character.
  - If the string length is even, return the two middle characters.
- **Example**:
  - **Input**: "hello"
  - **Output**: `l`
  - **Input**: "worlds"
  - **Output**: `rl`

---

✨ **Highlights**: Two problems solved today! We explored recursion to solve a mathematical challenge and practiced string manipulation to extract middle characters efficiently. Onwards to more adventures! 🚀

# 🌟 Day 15: Solved Problems (April 16, 2025)

## 🚀 Problems Solved

### 1️⃣ Matrix Row Swap

- **Task:** Swap two rows of a matrix as per user input.
- **Note:** Validate that the chosen rows exist.

---

### 2️⃣ Mini Peaks

- **Task:** Find elements in an array that are greater than their immediate neighbors.

---

### 3️⃣ Min and Max in Array

- **Task:** Determine the smallest and largest numbers in an array.

---

### 4️⃣ Reverse an Array

- **Task:** Reverse the order of elements in an array.

---

### 5️⃣ Sum of Positive and Negative Numbers

- **Task:** Calculate separate sums for positive and negative numbers in an array.

---

✨ **Summary:**
Solved five problems today covering matrix operations and various array manipulations. Ready for the next challenge!

# 🌟 Day 16: Solved Problems (April 17, 2025)

## 🚀 Problems Solved

### 1️⃣ Swap Columns in a Matrix

- **Task:** Swap two specified columns of a matrix based on user input.
- **Highlights:**
  - Validates column indices.
  - Efficiently swaps columns by iterating through rows.
- **Example:**
  - **Input:**

    ```
    1 2 3
    4 5 6
    7 8 9
    ```

    Swap columns 1 and 3.
  - **Output:**

    ```
    3 2 1
    6 5 4
    9 8 7
    ```

---

### 2️⃣ Symmetric Matrix Check

- **Task:** Determine if a matrix is symmetric. A matrix is symmetric if it equals its transpose.
- **Highlights:**
  - Validates the square shape of the matrix.
  - Compares elements above the main diagonal for symmetry.
- **Example:**
  - **Input:**

    ```
    1 2 3
    2 5 6
    3 6 9
    ```
  - **Output:** `Symmetric`

---

### 3️⃣ Transpose a Matrix

- **Task:** Compute the transpose of a square matrix in-place.
- **Highlights:**
  - Efficiently swaps elements to achieve transposition.
- **Example:**
  - **Input:**

    ```
    1 2 3
    4 5 6
    7 8 9
    ```
  - **Output:**

    ```
    1 4 7
    2 5 8
    3 6 9
    ```

---

✨ **Summary:** Three matrix-focused problems were tackled today, covering column manipulation, symmetry validation, and in-place transposition. Great progress in understanding matrix operations! 🚀

# **🌟 Day 17: Solved Problems (April 18, 2025\)**

## **🚀 Highlights of the Day**

### **1️⃣ Right Triangle Patterns**

- **Task:** Print various right triangle arrangements using numbers and spaces.
- **Patterns Learned:**

  - Increasing numbers (1 to `n`)
  - Decreasing numbers (`n` to 1\)
  - Repeated rows with identical numbers
  - Right-aligned triangles using leading spaces
- **Example Output:** For `n = 4`, you’ll generate multiple triangular shapes showcasing these variations.

---

### **2️⃣ Pascal’s Triangle**

- **Task:** Build and print Pascal’s triangle with stars (`*`), spanning `2n-1` rows for a diamond effect.
- **Key Learning:**

  - Dynamically adjust the count of symbols to mirror the triangle’s expansion and contraction.
- **Example Output:** For `n = 4`, the star-based Pascal’s triangle flows up then down seamlessly.

---

### **📚 Learning Focus: Time Complexity**

- **O(1):** Constant time — instant operations (e.g., direct element access) 📖
- **O(log n):** Logarithmic — halving search space like Binary Search 🎯
- **O(n):** Linear — full traversal, like scanning an array 🔍
- **O(n²):** Quadratic — nested loops, as in pairwise comparisons 🧩
- **O(2ⁿ):** Exponential — branching recursion, like Tower of Hanoi 🏰

| Complexity         | Real-Life Example                     | Algorithm Example  |
| ------------------ | ------------------------------------- | ------------------ |
| **O(1)**     | Grab the first book 📖                | Array index access |
| **O(log n)** | Number-guessing game 🎯               | Binary Search      |
| **O(n)**     | Checking every locker 🔒              | Linear Search      |
| **O(n²)**   | Student pair comparisons 👩‍🎓👨‍🎓 | Bubble Sort        |
| **O(2ⁿ)**   | Puzzle permutations 🧩                | Tower of Hanoi     |

---

### **✨ Takeaway**

Today’s pattern work honed loop control and output formatting, while revisiting time complexity concepts solidified algorithmic insights. Onward to Day 18\! 🚀

# 🌟 Day 18: Solved Problems (April 19, 2025)

## 🚀 Highlights of the Day

### 1️⃣ **Binary Search**

- **Task:** Efficiently locate a target in a sorted array using iterative and recursive binary search methods.
- **Approach:**
  - **Iterative Binary Search:** Adjust the search range iteratively.
  - **Recursive Binary Search:** Use recursion to divide and conquer.
- **Example Output:**
  - Target found at index: `7`.

---

### 2️⃣ **Linear Search**

- **Task:** Sequentially traverse an array to find a target element.
- **Approach:**
  - Traverse from the first to the last element.
  - Return the index if the element matches the target.
- **Example Output:**
  - Target not found!

---

### 3️⃣ **Bubble Sort**

- **Task:** Sort an array using two versions of Bubble Sort.
- **Approach:**
  - **Basic Bubble Sort:** Compare and swap adjacent elements if out of order.
  - **Enhanced Bubble Sort:** Stop early if no swaps are made in a pass.
- **Example Output:**
  - Normal Bubble Sort: `[2, 25, 34, 44, 54]`
  - Enhanced Bubble Sort: `[1, 2, 3, 4, 5, 6]`

---

### 4️⃣ **Insertion Sort**

- **Task:** Sort an array by inserting elements into their correct position in a growing sorted list.
- **Approach:**
  - Iterate through the array and compare the current element with preceding elements.
  - Shift larger elements and insert the current element in its correct position.
- **Example Output:**
  - `[2, 25, 34, 44, 54]`

---

### 5️⃣ **Selection Sort**

- **Task:** Sort an array by repeatedly selecting the smallest element and swapping it with the current element.
- **Approach:**
  - Iterate through the array to find the minimum element in the unsorted part.
  - Swap the minimum element with the current element.
- **Example Output:**
  - `[2, 25, 34, 44, 54]`

---

## ✨ Learning Focus

- **Efficiency:** Improved understanding of how sorting and searching algorithms reduce time complexity.
- **Practice:** Reinforced concepts of iterative, recursive, and optimized approaches.

📖 **Key Takeaway:** Progress through understanding fundamental sorting and searching algorithms, laying the groundwork for advanced problem-solving 🚀!

# 🌟 Day 20: Solved Problems (April 21, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Trapping Rain Water

- **Goal:** Compute total water trapped between elevation bars.
- **Key Idea:** Two-pointer scan from ends, track `leftMax`/`rightMax`, add trapped water when `bar < max`.

### 2️⃣ Roman to Integer

- **Goal:** Convert a Roman numeral (e.g., “MCMXCIV”) to an integer.
- **Key Idea:** Traverse right-to-left, use a map of numeral values, subtract when a smaller value precedes a larger one.

---

## 🧠 Core Takeaways

- **Two-Pointer Technique:** Efficient O(n) array traversal with constant space.
- **Reverse Traversal Logic:** Simplifies subtraction rules in string parsing.

✨ Finished two practical problems—array and string algorithms in one go! Ready for Day 21! 🚀

# 🌟 Day 21: Solved Problems (April 22, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Longest Substring Without Repeating Characters

- **Goal:** Find the length of the longest substring that contains no duplicate characters.
- **Key Idea:** Use a sliding‑window with two pointers (`left`, `right`) and a set to track current characters. Expand `right`, and when a duplicate is found, shrink from `left` until the duplicate is removed. :contentReference[oaicite:0]{index=0}

---

### 2️⃣ Add Two Numbers in Linked Lists

- **Goal:** Given two non‑empty linked lists representing two non‑negative integers (digits stored in reverse order), return their sum as a linked list in the same reversed format.
- **Key Idea:** Traverse both lists concurrently, sum corresponding digits plus carry, create new nodes for each digit of the result, and propagate the carry. Use a dummy head to simplify list construction. :contentReference[oaicite:1]{index=1}

---

## 🧠 Core Takeaways

- **Sliding Window:** Optimal O(n) solution for substring problems with constant extra space (aside from the set).
- **Linked‑List Arithmetic:** Elementary addition logic applied node‑by‑node with carry, resulting in O(max(m, n)) time and O(max(m, n)) output space.

✨ Wrapped up two fundamental interview problems today—strings and linked lists—bolstering both window and list‑based techniques! Ready for Day 22! 🚀

# 🌟 Day 22: Solved Problems (April 23, 2025)

## 🚀 Problems Solved

### 1️⃣ Linked List Cycle Detection

- **Description:** Determine if a singly linked list has a cycle using Floyd’s Tortoise and Hare algorithm.
- **Approach:** Use two pointers—**slow** moves one step, **fast** moves two steps. If they ever meet, a cycle exists; if **fast** reaches the end (`null`), the list is acyclic. :contentReference[oaicite:0]{index=0}

---

### 2️⃣ Middle of a Linked List

- **Description:** Find the middle node of a singly linked list. If there are two middles, return the second.
- **Approach:** Again employ two pointers—**slow** advances one node per step, **fast** advances two. When **fast** reaches the end, **slow** will be at the middle. :contentReference[oaicite:1]{index=1}

---

## 🧠 Core Takeaways

- **Fast & Slow Pointer Pattern:** One pointer at double speed naturally reveals both cycles and midpoints in O(n) time with O(1) space.
- **Floyd’s Algorithm Versatility:** The same two‑pointer template applies to cycle detection and list‑splitting tasks.

✨ Solidified linked‑list mastery today! On to Day 23! 🚀

# 🌟 Day 23: Solved Problems (April 24, 2025)

Today I implemented two distinct algorithms: one for expanding a compact string with multi-digit repeat counts, and another for sorting array elements at odd and even positions with different sort orders.

---

## 1️⃣ String Expansion

- **Task:** Given an input like `a1b10`, produce `abbbbbbbbbb` by repeating each letter by its following integer count (which may be one or two digits). :contentReference[oaicite:0]{index=0}
- **Approach:**
  1. Iterate through the string, reading a letter then parsing all subsequent digits into an integer count. :contentReference[oaicite:1]{index=1}
  2. Append the letter to a `StringBuilder` count times.
  3. Validate format (letter must precede digits; counts 0–99).

---

## 2️⃣ Odd-Even Distance-2 Sort

- **Task:** Sort elements at 1-based odd positions in descending order and at 1-based even positions in ascending order (i.e. 0-based even indices descending, odd indices ascending). :contentReference[oaicite:2]{index=2}
- **Approach:**
  1. Repeatedly perform two phases until no swaps occur:
     - **Phase A:** For 0-based odd indices, compare `a[i]` with `a[i+2]` and swap if out of ascending order.
     - **Phase B:** For 0-based even indices, compare `a[i]` with `a[i+2]` and swap if out of descending order. :contentReference[oaicite:3]{index=3}
  2. This “distance-2” bubble-sort ensures local ordering that converges to the global pattern.

---

## 🧠 Key Takeaways

- **Robust Parsing:** Handling multi-digit counts in string expansion requires careful digit accumulation.
- **Custom Sort Passes:** Splitting sorting into two interleaved phases can achieve complex index-based orderings in O(n·k) time (k = number of passes).

✨ Two more challenges mastered—ready for Day 24! 🚀

# 🌟 Day 24: Solved Problems (April 25, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Reverse Words in a String (Recursion)

- **Task:** Given a sentence, recursively reverse the word order (e.g. “one two three” → “three two one”).
- **Key Idea:** Repeatedly extract the last word and recurse on the prefix until no characters remain.
- **Complexity:** O(n²) in worst case due to substring concatenation; can be optimized with StringBuilder. :contentReference[oaicite:0]{index=0}

---

### 2️⃣ First Occurrence of Substring

- **Task:** Find the index of the first occurrence of `word2` in `word1` without using built-in search (e.g. “test123string”, “123” → 4).
- **Key Idea:** Slide a window of length `|word2|` over `word1`, compare character by character.
- **Complexity:** O(n·m), where n=|word1|, m=|word2|. :contentReference[oaicite:1]{index=1}

---

### 3️⃣ Diagonal “X” Pattern Print

- **Task:** Given an odd-length string of digits, print its characters on both diagonals in an “X” shape.
- **Key Idea:** For each row i, print character at i for column i and again at column (n−1−i).
- **Complexity:** O(n²) for n×n grid. :contentReference[oaicite:2]{index=2}

---

## 🧠 Core Takeaways

- **Recursive string processing** can be intuitive but watch out for repeated concatenation costs.
- **Manual substring search** reinforces sliding-window fundamentals before using built-ins.
- **Pattern printing** solidifies control over nested loops and index arithmetic.

✨ Three more fundamental string and pattern problems down—onward to Day 25! 🚀

# 🌟 Day 25: Solved Problems (April 26, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Group Anagrams Without Built-ins

- **Task:** Given a list of words, group them into lists of anagrams (e.g. `["act","god","cat","dog","tac"]` → `[["act","cat","tac"],["god","dog"]]`).
- **Key Idea:** For each word, compare character frequencies against every other word using a fixed-size 26-element array. Mark words as used to avoid repeats.
- **Complexity:** O(n² · k), where n = number of words, k = average word length.

### 2️⃣ Multiply Decimal Strings Without “*”

- **Task:** Multiply two non-negative integers given as decimal strings (e.g. `"123"` × `"45"`) without using the `*` operator.
- **Key Idea:**
  1. **Parse** each string into an integer using only bit-shifts and addition (`x*10 = (x<<3)+(x<<1)`).
  2. **Multiply** via the Russian-peasant (Egyptian) algorithm: repeatedly double and add based on the multiplier’s binary bits.
- **Complexity:** O(n + m + log M), where n, m = input lengths, M = parsed numeric value.

---

## 🧠 Core Takeaways

- **Brute-Force Grouping:** Even without sorting or maps, fixed-size frequency arrays let you detect anagrams in constant extra space per comparison.
- **Bit-Shift Parsing & Multiplication:** You can reconstruct decimal parsing and multiplication from first principles using only shifts, additions, and bit-tests.

✨ Two more algorithmic patterns mastered—array grouping and low-level arithmetic! Ready for Day 26! 🚀

# 🌟 Day 26: Solved Problems (April 27, 2025)

Today I tackled three array- and string-manipulation tasks, practicing brute-force grouping, in-place reordering, and various swap techniques. These exercises reinforced frequency-count methods, two-pointer scans, and bitwise operations for in-place data transformations.

---

## 1️⃣ Group Anagrams (Array-Only)

**Task:** Given `["act","god","cat","dog","tac"]`, group into `[['act','cat','tac'],['god','dog']]`.
**Key Idea:** For each word, build a 26-element frequency array and compare with every other word; mark used words to avoid repeats. :contentReference[oaicite:0]{index=0} :contentReference[oaicite:1]{index=1}
**Complexity:** O(n²·k) time, O(n·k) total space for output (k=word length).

---

## 2️⃣ Move Zeros to End

**Task:** In `[1,2,0,4,3,0,5,0]`, shift all `0`s to the right while preserving non-zero order.
**Key Idea:** Use a write-index `j` to compact non-zeros to front, then fill trailing positions with `0`. :contentReference[oaicite:2]{index=2} :contentReference[oaicite:3]{index=3}
**Complexity:** O(n) time, O(1) extra space.

---

## 3️⃣ Reverse Array In-Place

**Task:** Reverse `[1,4,3,2,6,5]` without extra array.
**Key Idea:** Swap symmetric pairs using a temporary variable—or alternately via XOR swap—to achieve O(1) space. :contentReference[oaicite:4]{index=4} :contentReference[oaicite:5]{index=5}
**Complexity:** O(n) time, O(1) space.

---

## 🧠 Core Takeaways

- **Frequency Arrays** enable brute-force anagram grouping without sorting or hashmaps.
- **Two-Pointer & Write-Index** patterns solve in-place reordering (zeros, reversal) in linear time.
- **XOR Swap Trick** shows how bitwise ops can eliminate temporaries—useful in low-level optimizations. :contentReference[oaicite:6]{index=6}

✨ Three more foundational algorithms mastered—onward to Day 27! 🚀

# 🌟 Day 27: Solved Problems (May 6, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Union of Two Arrays

- **Task:** Combine two integer arrays into one array of distinct elements (the union).
- **Example:**
  - Input: `a = [1,2,3,4,5,2,3]`, `b = [3,6,2,7,1]`
  - Output: `[1,2,3,4,5,6,7]` (count = 7)
- **Approach:**
  1. Sort both arrays.
  2. Merge with two pointers, skipping duplicates.
  3. Collect unique values into result.

---

### 2️⃣ Left-Rotate Array by d Positions

- **Task:** Rotate an array to the left by `d` positions in-place.
- **Example:**
  - Input: `[1,2,3,4,5,6,7]`, `d=2` → `[3,4,5,6,7,1,2]`
- **Approach (Reversal Algorithm):**
  1. Reverse first `d` elements.
  2. Reverse remaining `n–d` elements.
  3. Reverse entire array.

---

## 🧠 Key Takeaways

- **Two-Pointer Merge:** Efficiently produce a sorted union in O(n log n + m log m) time.
- **In-Place Rotation:** Reversal algorithm achieves left rotation in O(n) time with O(1) extra space.

✨ Two more core array-manipulation patterns mastered—ready for Day 28! 🚀

# 🌟 Day 28: Solved Problems (April 29, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Next Permutation

- **Task:** Rearrange an array of integers to the lexicographically next greater permutation. If no such permutation exists, sort the array in ascending order.
- **Examples:**
  - Input: `[2, 4, 1, 7, 5, 0]` → Output: `[2, 4, 5, 0, 1, 7]`
  - Input: `[3, 2, 1]` → Output: `[1, 2, 3]`
- **Approach:**
  1. Identify the pivot: Traverse from the end until the first decreasing element is found.
  2. Find the successor: The smallest number larger than the pivot to the right.
  3. Swap pivot and successor.
  4. Reverse the suffix starting after the pivot.

---

### 2️⃣ Alternative Sorting

- **Task:** Sort an array alternately with the largest element followed by the smallest element.
- **Examples:**
  - Input: `[7, 1, 2, 3, 4, 5, 6]` → Output: `[7, 1, 6, 2, 5, 3, 4]`
- **Approach:**
  1. Sort the array in ascending order.
  2. Place the largest elements at odd positions and smallest elements at even positions.
  3. If the array length is odd, place the middle element last.

---

## 🧠 Key Takeaways

- **Pivot Identification:** Key to generating permutations.
- **Two-Pointer Swaps:** Efficient for both permutation and alternate sorting tasks.
- **Versatile Sorting Techniques:** Reinforced mastery of custom sorting logic.

✨ Solidified concepts in permutations and custom array manipulation. Onward to Day 29! 🚀

# 🌟 Day 29: Solved Problems (April 30, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Majority Elements (> n/3)

- **Task:** Find all numbers in an array that appear more than ⌊n/3⌋ times.
- **Key Idea:** Extended Boyer–Moore Voting
  1. First pass: identify up to two candidate elements by voting.
  2. Second pass: verify which candidates truly exceed n/3 occurrences.
  3. Sort and return the result.
- **Complexity:** O(n) time, O(1) extra space.
- **Example:**
  - Input: `[2,2,3,1,3,2,1,1]`
  - Output: `[1,2]`

---

### 2️⃣ Remove Invalid Parentheses

- **Task:** Given a string with parentheses, remove the minimum number of invalid parentheses to generate all valid strings.
- **Key Idea:** BFS over string states
  1. Use a queue to explore all strings reachable by removing one parenthesis.
  2. At each level, check validity; once any valid strings are found, stop and return all valid at that level.
- **Complexity:** Worst-case exponential, but stops early when solutions are found.
- **Example:**
  - Input: `"()())()"`
  - Output: `["()()()", "(())()"]`

---

## 🧠 Core Takeaways

- **Voting Algorithm:** Efficiently finds heavy hitters in a single pass with constant space.
- **BFS Pruning:** Guarantees minimal removals by exploring level by level.

✨ Two advanced patterns mastered—ready for Day 30! 🚀

# 🌟 Day 30: Solved Problems (May 1, 2025)

## 🚀 Today’s Challenges

---

### 1️⃣ Maximum Profit from Stock Prices

**Task:** Given daily stock prices, compute the maximum profit by summing each upward swing—you may buy and sell multiple times.**Key Idea:**

1. Scan once, find each local **valley** (buy) and subsequent **peak** (sell).
2. Accumulate `(peak – valley)` for total profit.
   **Complexity:** O(n) time, O(1) space
   **Example:**
   Prices: [100, 180, 260, 310, 40, 535, 695] Valleys→Peaks: (100→310), (40→695) Profit = (310−100) + (695−40) = 865

### 2️⃣ Generate “3-4” Number System

**Task:** Print the first n numbers whose only digits are 3 or 4, in lexicographic order of that custom system (e.g. 3, 4, 33, 34, 43, …).**Key Idea:**

1. Represent sequence index `i` in binary.
2. Map each binary digit: `0 → ‘3’`, `1 → ‘4’`, building from least significant bit upward.
   **Complexity:** O(n·log n) time (each conversion is O(log i)), O(log n) space per number
   **Example (n = 5):**
   i=1 (binary 0) → “3” i=2 (binary 1) → “4” i=3 (binary 00) → “33” i=4 (binary 01) → “43” i=5 (binary 10) → “34”

## 🧠 Core Takeaways

- **Local-Extrema Summation:** Summing each valley→peak rise yields optimal multi-transaction profit in O(n).
- **Custom-Base Mapping:** You can generate any fixed-digit numeral system by mapping binary (or another base) representations to chosen symbols.

✨ Two more patterns mastered—array peaks & custom numeral generation! On to Day 31! 🚀

# 🌟 Day 31: Solved Problems (May 2, 2025)

## 🚀 Today’s Challenges

---

### 1️⃣ Single-Transaction Stock Profit

- **Task:** Given an array of daily stock prices, compute the maximum profit from exactly one buy-then-sell.
- **Key Idea:**
  - Track the lowest purchase price seen so far (`minPrice`).
  - On each day, compute potential profit = `price – minPrice`.
  - Update `maxProfit` if this profit is higher; update `minPrice` if current price is lower.
- **Complexity:** O(n) time, O(1) space
- **Example:**
  Prices: [7, 10, 1, 3, 6, 9, 2]
  Buy at 1, sell at 9 → Profit = 8

### 2️⃣ Validate Mathematical Expression

- **Task:** Check if a string expression of parentheses, operators (`+ - * /`), and alphanumeric tokens is syntactically valid.
- **Key Idea:**
- Use a stack to ensure parentheses balance.
- Maintain flags (`lastWasOperator`, `lastWasOpenParen`) to forbid invalid operator placement (e.g. two operators in a row, operator right after `'('`, operator right before `')'`).
- Skip whitespace; treat letters/digits as operands.
- **Complexity:** O(n) time, O(n) space (for stack)
- **Example Valid/Invalid Cases:**
  "(a+b)*c" → valid
  "a++b" → invalid (consecutive operators)
  "(*b)" → invalid (operator after '(')
  "()())()" → invalid (unmatched ')')

## 🧠 Core Takeaways

- **One-pass Min/Max Tracking:** Capturing minimum buy price and computing profit on the fly yields optimal single-trade profit in O(n).
- **Stateful Parsing with Stack & Flags:** Combining stack-based parenthesis matching with simple state flags enforces operator/operand ordering rules in a single pass.

✨ Two more foundational patterns—single-trade optimization and grammar validation—checked off! On to Day 32! 🚀

# 🌟 Day 32: Solved Problems (May 3, 2025)

## 🚀 Today’s Challenges

---

### 1️⃣ Minimize Maximum–Minimum Height Difference

**Task:** Given tower heights `arr[]` and an integer `k`, adjust each height by either +k or –k (once) to minimize the difference between the tallest and shortest towers. Do this **without** using built‑in sort, min or max.**Approach:**

1. **Manual sort** the array via bubble‑sort (O(n²)).
2. Compute the initial difference between the largest and smallest.
3. For each possible “split” index `i`, treat items `0…i–1` as increased by k and items `i…n–1` as decreased by k (skip if decrease goes negative).
4. Track the new min/max at each split using manual comparisons, update the best (smallest) difference.
   **Complexity:** O(n²) time (bubble‑sort + one O(n) scan per split), O(1) extra space
   **Example:**
   Input: arr = [1,5,8,10], k = 2
   After sort: [1,5,8,10]
   Best adjustment → [1+2, 5−2, 8−2,10−2] = [3,3,6,8]
   Min=3, Max=8 → Difference = 5

### 2️⃣ Maximum Subarray Sum (Kadane’s Algorithm)

**Task:** Find the contiguous subarray within `arr[]` which has the largest sum.**Approach:**

- Maintain two variables:
  - `currentSum` = maximum subarray sum ending at current index
  - `maxSum` = global maximum subarray sum so far
- Iterate once:
  1. `currentSum = max(arr[i], currentSum + arr[i])`
  2. `maxSum = max(maxSum, currentSum)`
     **Complexity:** O(n) time, O(1) space
     **Example:**
     Input: [2,3,-8,7,-1,2,3]
     Kadane’s steps:
     currentSum,maxSum
     2,2
     5,5
     -3,5
     7,7
     6,7
     8,8
     11,11 ← answer
     Output: 11

## 🧠 Core Takeaways

- **Custom Sorting & Scanning:** Even without built‑ins, you can manually sort and then perform a linear scan to solve the “minimize heights” problem.
- **Kadane’s Insight:** A simple running-sum update captures the best subarray in one pass with constant space.

✨ Two more classic patterns in place—onward to Day 33! 🚀

# 🌟 Day 33: Solved Problems (May 4, 2025)

## 🚀 Today’s Challenges

---

### 1️⃣ Maximum Product Subarray

**Task:** Find the maximum product of a contiguous subarray within the given array `arr[]`.

---

**Approach:**

* Use **two traversal directions** (left-to-right and right-to-left) to handle cases with zeros and negative numbers effectively.
* Maintain two running products:
  * `leftToRight`: Product from left to right.
  * `rightToLeft`: Product from right to left.
* Update `maxProd` at each step as the maximum of:
  * `leftToRight`
  * `rightToLeft`
  * Current `maxProd`
* Reset the running product to `1` if it becomes `0` to account for zero breaks.

---

**Complexity:**

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

**Edge Cases:**

* Array with zeros: Ensure the product resets correctly.
* All negatives: Max product will be the largest single element if the number of negatives is odd.

---

**Example:**

Input:

`arr[] = [-2, 6, -3, -10, 0, 2]`

Output:

`180`

Explanation:

The subarray with the maximum product is `{6, -3, -10}`, with the product calculated as:

`6 * (-3) * (-10) = 180`.

---

## 🧠 Key Insights

* **Dual Direction Traversal:** Helps efficiently track the product split by zeros or negative signs in the array.
* **Reset on Zero:** Necessary to correctly handle zero breaks in the product.
* **Comparison at Each Step:** Ensure no possible product is missed during traversal.

---

✨ Another classic solved—onward to Day 34! 🚀

# 🌟 Day 35: Solved Problems (May 5, 2025)

## 🚀 Today’s Challenge

### Maximum Circular Subarray Sum

**Task:** Given a circular array of integers, find the maximum possible sum of any subarray, where subarrays may wrap from the end back to the start.

---

## 🧠 Approach

1. **Normal Kadane’s**
   - Compute the standard maximum subarray sum (non‑circular) using Kadane’s algorithm.
2. **Circular Sum via Inversion**
   - Compute the total sum of the array.
   - Invert all elements (multiply by –1) and run Kadane’s again to find the maximum sum of the inverted array, which corresponds to the minimum subarray sum of the original.
   - The maximum wrap‑around sum = total sum + (max sum of inverted)
3. **Choose the Best**
   - If all numbers are negative, the normal Kadane’s result is the answer.
   - Otherwise, the answer is the maximum of the normal and wrap‑around sums.

---

## 🔍 Complexity

- **Time:** O(n) — each pass (Kadane’s + inversion) processes the array once
- **Space:** O(1) — only a few variables regardless of input size

---

## 📋 Examples

| Input                              | Output | Explanation                                      |
| ---------------------------------- | :----: | ------------------------------------------------ |
| `[8, -8, 9, -9, 10, -11, 12]`    |   22   | Wrap subarray `[12,8,-8,9,-9,10]` sums to 22   |
| `[10, -3, -4, 7, 6, 5, -4, -1]`  |   23   | Wrap subarray `[7,6,5,-4,-1,10]` sums to 23    |
| `[-1, 40, -14, 7, 6, 5, -4, -1]` |   52   | Wrap subarray `[7,6,5,-4,-1,-1,40]` sums to 52 |

---

## 🎯 Key Takeaways

- **Kadane’s Algorithm** solves the non‑circular max‑subarray in O(n).
- **Array inversion trick** converts the “min‑subarray” problem into another Kadane’s run for the circular case.
- Edge‑case: all-negative arrays must use the non‑circular result.

🚀 On to Day 36!

# 🌟 Day 36: Solved Problems (May 6, 2025)

---

## 🚀 Today’s Challenges

---

### 1️⃣ Print an X Pattern

**Task:** Given an odd-length string, print it in an "X" pattern, with characters aligned diagonally.**Approach:**

- Use a single loop with two pointers:
  - **`i`** iterates from left to right.
  - **`j = n - 1 - i`** iterates from right to left.
- At each step, fill an empty row with spaces, then place the corresponding characters at indices `i` and `j`.
- Print the row for each iteration.**Complexity:**
- **Time:** O(n²) — one pass for each row and each fill operation.
- **Space:** O(n) — row buffer.**Edge Cases:**
- Input string must have an odd length.
- Handle invalid inputs with appropriate exceptions.

**Example:**
Input: `PROGRAM`
Output:
// P         M
//  R      A
//    O  R
//      G
//   O    R
//  R       A
// P          M

---

### 2️⃣ Smallest Missing Positive Number

**Task:** Find the smallest missing positive integer in an unsorted array.**Approach:**

1. **Mark Visited:**
   - Use a boolean array to track numbers in the range `[1, n]` that are present.
2. **Identify Missing:**
   - Iterate from `1` to `n` and return the first unvisited index.
3. **Handle All Found Case:**
   - If all numbers from `1` to `n` are present, return `n + 1`.
     **Complexity:**

- **Time:** O(n) — single pass to mark visited and single pass to check.
- **Space:** O(n) — boolean array for tracking.**Edge Cases:**
- Negative numbers or zeros.
- Duplicates in the array.

**Example:**
Input: `[2, -3, 4, 1, 1, 7]`
Output: `3`

---

## 🎯 Key Takeaways

### Print X Pattern

- Use a row buffer for efficient row-wise construction.
- Single loop with dual pointers minimizes complexity.

### Smallest Missing Positive Number

- Boolean arrays are a simple and effective way to track elements within a constrained range.
- Edge cases like duplicates or negatives must be explicitly handled.

🚀 Ready for Day 37!

# 🌟 Day 37: Solved Problems (May 7, 2025)

## 🚀 Today’s Challenge

### Implement **`myAtoi(String s)`**

Convert a string to a 32‑bit signed integer, replicating C/C++’s `atoi` behavior **without** built‑in parsing functions.

---

## 🧠 Approach

1. **Skip leading whitespace**
   - Advance index past any spaces. :contentReference[oaicite:0]{index=0}
2. **Read optional sign**
   - If next char is `+` or `-`, record sign and advance. :contentReference[oaicite:1]{index=1}
3. **Parse digits**
   - For each digit, compute `result = result * 10 + digit`.
   - Use a 64‑bit accumulator (`long`) to detect overflow before casting to `int`. :contentReference[oaicite:2]{index=2}
4. **Clamp on overflow**
   - If `result` exceeds `Integer.MAX_VALUE` or goes below `Integer.MIN_VALUE`, return the respective boundary. :contentReference[oaicite:3]{index=3}
5. **Stop on first non‑digit**
   - Break parsing loop when encountering any non‑numeric character. :contentReference[oaicite:4]{index=4}

---

## 🔍 Complexity

- **Time:** O(n) — single pass through the string.
- **Space:** O(1) — fixed number of variables.

---

## 📋 Examples

| Input                 |     Output     | Notes                               |
| --------------------- | :-------------: | ----------------------------------- |
| `"-123"`            |    `-123`    | Simple negative number.             |
| `"   -0012gfg4"`    |     `-12`     | Leading zeros, stops at non‑digit. |
| `"4193 with words"` |    `4193`    | Parses initial digits only.         |
| `"words and 987"`   |      `0`      | No leading digits → 0.             |
| `"2147483648"`      | `2147483647` | Clamped to `Integer.MAX_VALUE`.   |
| `"-2147483649"`     | `-2147483648` | Clamped to `Integer.MIN_VALUE`.   |

---

## 🎯 Key Takeaways

- **Manual parsing** replicates library `atoi` without built‑ins.
- **Overflow detection** via wider accumulator prevents incorrect wrap‑around.
- **Early exit** on non‑digits handles mixed‑content strings correctly.

---

# Day 38: Add Binary Strings (May 8, 2025)

## 🚀 Problem Statement

Write a Java function `addBinary(String s1, String s2)` that adds two binary strings and returns their sum as a binary string. The output should have no leading zeros unless the result itself is "0".

---

## 🧩 Methodology

### Step-by-Step Approach

1. **Preparation**:

   - Initialize a `StringBuilder` for the result.
   - Set a `carry` variable to 0.
   - Use two pointers to traverse `s1` and `s2` from the rightmost digit.
2. **Iterative Addition**:

   - Add corresponding bits from both strings and the carry.
   - Compute the current bit (`sum % 2`) and append it to the result.
   - Update the carry (`sum / 2`).
3. **Handle Remaining Carry**:

   - If a carry remains after traversing both strings, append it to the result.
4. **Formatting**:

   - Reverse the `StringBuilder` to form the final binary result.
   - Ensure no leading zeros in the result unless the answer is "0".

---

## 🔍 Complexity Analysis

- **Time Complexity**: O(n), where `n` is the maximum length of `s1` and `s2`.
- **Space Complexity**: O(n), for storing the result in a `StringBuilder`.

---

# 🌟 Day 39: Solved Problems (May 9, 2025)

## 🚀 Today’s Challenge

### Anagram Checker

**Task:** Implement `isAnagram(s1, s2)` to determine whether two strings are anagrams (i.e. they contain exactly the same letters in any order), ignoring case.

---

## 🧠 Approach

1. **Length Check**

   - If `s1.length() != s2.length()`, immediately return `false`.
2. **Frequency Counting**

   - Allocate an integer array of size 26 (for letters ‘a’–‘z’).
   - Traverse `s1`, convert each character to lowercase, and increment its count.
   - Traverse `s2`, convert each character to lowercase, and decrement its count—if any count goes negative, return `false` early.
3. **Validation**

   - After both passes, verify that every entry in the count array is zero.
   - If so, the two strings are anagrams; otherwise, they are not.

---

## 🔍 Complexity

- **Time:** O(n) — each string is scanned once.
- **Space:** O(1) — the fixed 26‑element count array.

---

# 🌟 Day 40: Solved Problems (May 10, 2025)

## 🚀 Today’s Challenge

### First Non‑Repeating Character in a String

Implement two variants of “first non‑repeating character”:

1. **Case‑Insensitive** – treat `A` and `a` as the same letter.
2. **Case‑Sensitive** – distinguish uppercase and lowercase.

---

## 🧠 Approach

1. **Count Frequencies**
   - Case‑insensitive: map ‘a’–‘z’ → 0–25.
   - Case‑sensitive: map ‘a’–‘z’ → 0–25, ‘A’–‘Z’ → 26–51.
2. **Scan for First Unique**
   - Iterate original string order; return first character whose frequency == 1.
3. **Fallback**
   - If none found, return a sentinel (e.g. `$`).

---

## 🔍 Complexity

- **Time:** O(n) — two passes over the string (count + scan).
- **Space:** O(1) — fixed‑size frequency array (26 or 52 entries).

---

## 💡 Code

```java








public class Solution {
    // Case‑insensitive
    static char nonRepeatingCharCI(String s) {
        String t = s.toLowerCase();
        int[] freq = new int[26];
        for (char c : t.toCharArray()) freq[c - 'a']++;
        for (char c : t.toCharArray())
            if (freq[c - 'a'] == 1) return c;
        return '$';
    }

    // Case‑sensitive
    static char nonRepeatingCharCS(String s) {
        int[] freq = new int[52];
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) freq[c - 'a']++;
            else if (Character.isUpperCase(c)) freq[26 + (c - 'A')]++;
        }
        for (char c : s.toCharArray()) {
            int idx = Character.isLowerCase(c) ? c - 'a' : 26 + (c - 'A');
            if (freq[idx] == 1) return c;
        }
        return '$';
    }
}

# 🌟 Day 41: Solved Problems (May 11, 2025)

## 🚀 Today’s Challenge

### Find All Pattern Occurrences in Text Using the KMP Algorithm  

Given a `text` and a `pattern`, find all starting indices where the pattern appears in the text using the **Knuth-Morris-Pratt (KMP)** algorithm.  

---

## 🧠 Approach

1. **Preprocess Pattern**  
   - Compute the **Longest Prefix Suffix (LPS)** array.  
   - `LPS[i]` indicates the length of the longest prefix of the pattern that is also a suffix for `pat[0...i]`.  

2. **Search in Text**  
   - Use the `LPS` array to skip unnecessary character comparisons in the text.

3. **Edge Cases**  
   - Empty `pattern` or `text`.  
   - Pattern length greater than text length.

---

## 🔍 Complexity

- **Time Complexity:** O(N + M)  
   - O(M) for computing the LPS array.  
   - O(N) for searching through the text.  
- **Space Complexity:** O(M) for storing the LPS array.

---

## 💡 Code

```java
import java.util.ArrayList;
import java.util.List;

public class FindPatternOccurrences {

    public static List<Integer> findAllOccurrences(String txt, String pat) {
        List<Integer> resultIndices = new ArrayList<>();

        if (pat == null || txt == null || pat.isEmpty() || txt.length() < pat.length()) {
            return resultIndices;
        }

        int textLength = txt.length();
        int patternLength = pat.length();
        int[] lps = new int[patternLength];
        int lengthLPS = 0;
        int k = 1;

        lps[0] = 0;
        while (k < patternLength) {
            if (pat.charAt(k) == pat.charAt(lengthLPS)) {
                lps[k++] = ++lengthLPS;
            } else if (lengthLPS != 0) {
                lengthLPS = lps[lengthLPS - 1];
            } else {
                lps[k++] = 0;
            }
        }

        int i = 0, j = 0;
        while (i < textLength) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == patternLength) {
                resultIndices.add(i - j);
                j = lps[j - 1];
            } else if (i < textLength && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return resultIndices;
    }

    public static void main(String[] args) {
        String txt = "aabaacaadaabaaba";
        String pat = "aaba";
        System.out.println("Occurrences: " + findAllOccurrences(txt, pat)); // Expected: [0, 9, 12]
    }
}
  # 🌟 Day 42: Solved Problems (May 12, 2025)

## 🚀 Today’s Challenge

### Minimum Characters to Add to Make a Palindrome

Given a string `s`, find the **minimum number of characters** that need to be added to the front of the string to make it a **palindrome**.  

---

## 🧠 Approach

1. **Palindrome Check:**  
   - Use a helper function to determine if a string is a palindrome by comparing characters from both ends.  

2. **Iterate to Find Longest Palindromic Prefix:**  
   - Start with the full string and progressively shorten it to find the **longest prefix** that is a palindrome.

3. **Calculate Minimum Characters:**  
   - The result is the difference between the string length and the length of the longest palindromic prefix.

4. **Edge Cases:**  
   - Empty or null strings require `0` additions.  
   - Strings already palindromic require `0` additions.  

---

## 🔍 Complexity

- **Time Complexity:** O(N²)  
   - O(N) for palindrome check inside a loop of length N.  
- **Space Complexity:** O(1)  
   - No additional space except variables.

---

## 💡 Code

```java
public class MinCharsToMakePalindrome {

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int minCharsToAdd(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int n = s.length();
        int longestPalindromicPrefixLength = 0;

        for (int len = n; len >= 1; len--) {
            String prefix = s.substring(0, len);
            if (isPalindrome(prefix)) {
                longestPalindromicPrefixLength = len;
                break;
            }
        }

        return n - longestPalindromicPrefixLength;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println("Input: \"" + s1 + "\" -> Output: " + minCharsToAdd(s1));

        String s2 = "aacecaaaa";
        System.out.println("Input: \"" + s2 + "\" -> Output: " + minCharsToAdd(s2));

        String s3 = "race";
        System.out.println("Input: \"" + s3 + "\" -> Output: " + minCharsToAdd(s3));

        String s4 = "google";
        System.out.println("Input: \"" + s4 + "\" -> Output: " + minCharsToAdd(s4));

        String s5 = "abab";
        System.out.println("Input: \"" + s5 + "\" -> Output: " + minCharsToAdd(s5));

        String s6 = "aba";
        System.out.println("Input: \"" + s6 + "\" -> Output: " + minCharsToAdd(s6));

        String s7 = "a";
        System.out.println("Input: \"" + s7 + "\" -> Output: " + minCharsToAdd(s7));

        String s8 = "palindrome";
        System.out.println("Input: \"" + s8 + "\" -> Output: " + minCharsToAdd(s8));
    }
}


# 🌟 Day 44: String Rotation Check Using KMP (May 13, 2025)

## 🚀 Problem Statement

Determine if one string is a **rotation** of another.  

**Definition:**  
String `s2` is a rotation of string `s1` if there exists a way to split `s1` into two substrings `A` and `B` such that `s2 = B + A`.  

Example:  
`"cdab"` is a rotation of `"abcd"`.  

---

## 🧠 Approach

1. **Concatenate the Original String:**  
   - Concatenate `s1` with itself to create `s1 + s1`.  
   - If `s2` is a rotation of `s1`, then `s2` must appear as a substring in the concatenated string.  

2. **Optimized Substring Search with KMP Algorithm:**  
   - Use the **Knuth-Morris-Pratt (KMP)** algorithm to efficiently search for `s2` in `s1 + s1`.  
   - Compute the **Longest Prefix Suffix (LPS)** array for the pattern `s2` to reduce unnecessary comparisons.  

3. **Check Length and Validity:**  
   - Ensure both strings are non-null and of the same length.  
   - Handle edge cases like empty strings or identical strings.  

---

## 🔍 Complexity Analysis

- **Time Complexity:**  
  - LPS Array Construction: O(L)  
  - KMP Search: O(2L)  
  - Total: **O(L)**  

- **Space Complexity:**  
  - **O(L)** for the LPS array.  

---

## 💡 Code

```java
public class StringRotationCheck {

    public static boolean areRotations(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty()) {
            return true;
        }

        String concatenatedS1 = s1 + s1;
        int[] lps = computeLPSArray(s2);

        int i = 0, j = 0;
        while (i < concatenatedS1.length()) {
            if (s2.charAt(j) == concatenatedS1.charAt(i)) {
                i++;
                j++;
            }

            if (j == s2.length()) {
                return true;
            } else if (i < concatenatedS1.length() && s2.charAt(j) != concatenatedS1.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private static int[] computeLPSArray(String pattern) {
        int length = 0;
        int i = 1;
        int[] lps = new int[pattern.length()];
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        System.out.println("abcd and cdab: " + areRotations("abcd", "cdab")); // true
        System.out.println("aab and aba: " + areRotations("aab", "aba"));     // true
        System.out.println("abcd and acbd: " + areRotations("abcd", "acbd")); // false
    }
}


```


# 🌟 Day 45: Sort 0s, 1s, and 2s (May14, 2025)

## 🚀 Problem Statement

Given an array `arr[]` containing only the values 0, 1, and 2, sort it **in-place** so that all 0s come first, followed by 1s, then 2s.

**Example:**
`[0, 1, 2, 0, 1, 2]` → `[0, 0, 1, 1, 2, 2]`

---

## 🧠 Approach

1. **Initialize three pointers:**

   * `low = 0` (next position for 0)
   * `mid = 0` (current element)
   * `high = arr.length - 1` (next position for 2)

2. **One-pass partitioning:**
   Loop while `mid <= high`:

   * If `arr[mid] == 0`: swap `arr[low++]` and `arr[mid++]`.
   * Else if `arr[mid] == 1`: just `mid++`.
   * Else (`arr[mid] == 2`): swap `arr[mid]` and `arr[high--]` (do **not** increment `mid`).

3. **Result:**
   After the loop, 0s, 1s, and 2s are grouped correctly.

---

## 🔍 Complexity Analysis

* **Time Complexity:** O(N) — each element is processed at most once.
* **Space Complexity:** O(1) — only pointer variables and one temp var.

---

## 💡 Code

```java
public class Sort012Optimized {

    public void sort012(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int low = 0, mid = 0, high = arr.length - 1, temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low++] = arr[mid];
                    arr[mid++] = temp;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high--] = temp;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Sort012Optimized sorter = new Sort012Optimized();
        int[][] tests = {
            {0,1,2,0,1,2},
            {0,1,1,0,1,2,1,2,0,0,0,1},
            {2,1,0},
            {1,1,1,1},
            {0,0,0},
            {2,2,2,0}
        };

        for (int[] arr : tests) {
            System.out.println("Before: " + java.util.Arrays.toString(arr));
            sorter.sort012(arr);
            System.out.println("After:  " + java.util.Arrays.toString(arr));
            System.out.println();
        }
    }
}
```


# 🌟 Day 46: Solved Problems (May 15, 2025)

## 🚀 Today’s Challenge

### H‑Index Calculator  
Given an array of citation counts `citations[]`, compute the researcher’s H‑Index: the largest number `h` such that at least `h` papers have ≥ `h` citations each.

---

## 🧠 Approach

1. **Sort the citations** in ascending order.  
2. **Iterate** `h` from `n` down to `1` (where `n` is the number of papers):  
   - Check if `citations[n - h] >= h`.  
   - If true, return `h`.  
3. If no valid `h` found, return `0`.

---

## 🔍 Complexity

- **Time:** O(n log n) for sorting + O(n) scan → **O(n log n)**  
- **Space:** O(log n) recursion stack (Java’s Dual‑Pivot Quicksort)

---

## 💡 Code

```java
import java.util.Arrays;

public class HIndexCalculator {
    public static int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;
        int n = citations.length;
        Arrays.sort(citations);
        for (int h = n; h >= 1; h--) {
            if (citations[n - h] >= h) {
                return h;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{5, 0, 2, 0, 2})); // 2
        System.out.println(hIndex(new int[]{6, 0, 3, 5, 3})); // 3
        System.out.println(hIndex(new int[]{3, 0, 6, 1, 5})); // 3
        System.out.println(hIndex(new int[]{0, 0, 0}));       // 0
        System.out.println(hIndex(new int[]{10}));            // 1
        System.out.println(hIndex(new int[]{1,1,1,1,1}));     // 1
        System.out.println(hIndex(new int[]{100,200,300}));   // 3
    }
}
```
# 🌟 Day 47: Solved Problems (May 16, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Diagonal Sum of a Matrix

Compute the sum of the two diagonals (`d1` and `d2`) of a square matrix.

### 2️⃣ Merge Sort Implementation

Implement the **Merge Sort** algorithm to sort an array of integers.

---

## 💡 Problem 1: Diagonal Sum of a Matrix

### Approach

1. Use a 2D array to represent the square matrix.
2. Iterate through each row `i`:

   * Add the primary diagonal element `arr[i][i]` to `d1`.
   * Add the secondary diagonal element `arr[i][n-i-1]` to `d2`.
3. Output the sums.

### Complexity

* **Time:** O(n), single loop through rows of the matrix.
* **Space:** O(1), no additional memory used.

---

### Code

```java
public class Diagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int d1 = 0, d2 = 0;
        for (int i = 0; i < arr.length; i++) {
            d1 += arr[i][i];
            d2 += arr[i][arr.length - i - 1];
        }
        System.out.println("Diagonal 1: " + d1 + "\nDiagonal 2: " + d2);
    }
}
```

#### Example Output

For the input:

```
1 2 3
4 5 6
7 8 9
```

Output:

```
Diagonal 1: 15
Diagonal 2: 15
```

---

## 💡 Problem 2: Merge Sort

### Approach

1. Recursively split the array into halves.
2. Sort each half.
3. Merge the two sorted halves back into the main array.
4. Use temporary arrays to hold the left and right halves for merging.

### Complexity

* **Time:** O(n log n), splitting and merging involve log n levels and O(n) work per level.
* **Space:** O(n), due to temporary arrays for merging.

---

### Code

```java
import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6, 7};
        System.out.println("Unsorted array: " + Arrays.toString(numbers));

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }

    private static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            mergeSort(array, startIndex, midIndex);
            mergeSort(array, midIndex + 1, endIndex);
            merge(array, startIndex, midIndex, endIndex);
        }
    }

    private static void merge(int[] array, int startIndex, int midIndex, int endIndex) {
        int leftSize = midIndex - startIndex + 1;
        int rightSize = endIndex - midIndex;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[startIndex + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = array[midIndex + 1 + j];
        }

        int leftIndex = 0, rightIndex = 0, mainIndex = startIndex;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[mainIndex++] = leftArray[leftIndex++];
            } else {
                array[mainIndex++] = rightArray[rightIndex++];
            }
        }

        while (leftIndex < leftSize) {
            array[mainIndex++] = leftArray[leftIndex++];
        }
        while (rightIndex < rightSize) {
            array[mainIndex++] = rightArray[rightIndex++];
        }
    }
}
```

#### Example Output

Input: `[12, 11, 13, 5, 6, 7]`
Output: `[5, 6, 7, 11, 12, 13]`

---

## 🎯 Takeaways

* Efficient handling of diagonals in square matrices.
* Solidified understanding of Divide and Conquer using Merge Sort.

---

✨ On to Day 48! 🚀


# 🌟 Day 48: Solved Problems (May 17, 2025)

## 🚀 Today’s Challenges

### 1️⃣ Find the Missing Number

Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array.

### 2️⃣ Reverse a String

Write a Java program to reverse a given string without using any built-in functions or libraries.

### 3️⃣ FizzBuzz Problem

Print the numbers from 1 to n (default 100). For multiples of three print “Fizz”, for multiples of five print “Buzz”, and for multiples of both print “FizzBuzz”.

---

## 💡 Problem 1: Find the Missing Number

### Approach

1. Compute the expected sum of numbers from 0 to n: `expectedSum = n*(n+1)/2`.
2. Sum all elements in the array: `actualSum`.
3. The difference `expectedSum - actualSum` yields the missing number.
4. Alternatively, use bitwise XOR:

   * XOR all numbers from 0 to n.
   * XOR the result with each element of the array.
   * The final XOR value is the missing number.

### Complexity

* **Time:** O(n), single passes through the array.
* **Space:** O(1), constant extra space.

---

### Code

```java
import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 7, 5, 2, 6, 4};

        // Method 1: Sum
        long expectedSum = (arr.length * (arr.length + 1L)) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        System.out.println("Missing Number (Sum): " + (expectedSum - actualSum));

        // Method 2: XOR
        int missingNumberXor = 0;
        for (int i = 0; i <= arr.length; i++) {
            missingNumberXor ^= i;
        }
        for (int num : arr) {
            missingNumberXor ^= num;
        }
        System.out.println("Missing Number (XOR): " + missingNumberXor);
    }
}
```

#### Example Output

```
Missing Number (Sum): 1
Missing Number (XOR): 1
```

---

## 💡 Problem 2: Reverse a String

### Approach

1. **Simple concatenation:** Iterate from end to start, build a new string.
2. **In-place swap:** Convert string to `char[]`, swap characters from ends towards center, then create a new string.

### Complexity

* **Time:** O(n²) for concatenation (due to immutable strings), O(n) for in-place swap.
* **Space:** O(n) for the reversed string or char array.

---

### Code

```java
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("String: " + str);

        // Method A: Concatenation
        System.out.println("Reversed (Concat): " + reverseConcat(str));

        // Method B: In-place char swap
        System.out.println("Reversed (In-place): " + reverseInPlace(str));
    }

    private static String reverseConcat(String str) {
        if (str == null) return null;
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    private static String reverseInPlace(String str) {
        if (str == null) return null;
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return new String(arr);
    }
}
```

#### Example Output

```
String: Hello, World!
Reversed (Concat): !dlroW ,olleH
Reversed (In-place): !dlroW ,olleH
```

---

## 💡 Problem 3: FizzBuzz Problem

### Approach

1. Use a loop from 1 to n.
2. For each `i`:

   * If `i % 15 == 0`, print "FizzBuzz".
   * Else if `i % 3 == 0`, print "Fizz".
   * Else if `i % 5 == 0`, print "Buzz".
   * Otherwise print `i`.
3. **Bonus:** implement using Java Streams for a more functional style.

### Complexity

* **Time:** O(n), single pass through numbers.
* **Space:** O(1).

---

### Code

```java
import java.util.Scanner;
import java.util.stream.IntStream;

public class BuzzFizz {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Stream-based FizzBuzz
        doStreamFizzBuzz();

        // Classic for-loop FizzBuzz
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if      (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3  == 0) System.out.println("Fizz");
            else if (i % 5  == 0) System.out.println("Buzz");
            else                  System.out.println(i);
        }
        scanner.close();
    }

    private static void doStreamFizzBuzz() {
        System.out.print("Enter a number for streams: ");
        int n = scanner.nextInt();
        IntStream.rangeClosed(1, n)
                 .mapToObj(i -> (i % 15 == 0) ? "FizzBuzz"
                                           : (i % 3  == 0) ? "Fizz"
                                           : (i % 5  == 0) ? "Buzz"
                                                           : Integer.toString(i))
                 .forEach(System.out::println);
    }
}
```

#### Example Output

```
Enter a number for streams: 15
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
Enter a number: 15
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

---

## 🎯 Takeaways

* Mathematical and bitwise techniques for missing-number problems.
* Trade-offs between concatenation versus in-place operations for string reversal.
* Classic control-flow and functional approaches for FizzBuzz.

---

✨ On to Day 49! 🚀
## 🌟 Day 49: Solved Problems (May 18, 2025)

Today’s session covers two fundamental Java problems—checking if a string is a palindrome and detecting duplicate elements in an array. We explore both naïve and optimized solutions, leveraging two‑pointer traversal and hash‑based tracking for efficient performance. This reinforces core skills in string manipulation and collection handling, which are essential for interview prep and production code.

---

## 🚀 Today’s Challenges

1️⃣ **String Palindrome**
Check if a given string reads the same forwards and backwards without using built‑in reversal utilities ([GeeksforGeeks][1]).

2️⃣ **Detect Duplicate Elements in an Array**
Identify all elements that appear more than once in an integer array ([GeeksforGeeks][2]).

---

## 💡 Problem 1: String Palindrome

### Approach

1. **Two‑Pointer Traversal:**
   Initialize one pointer at the start and another at the end of the string; compare characters at these indices and move inward ([Stack Overflow][3]).
2. **Early Exit on Mismatch:**
   If any character pair doesn’t match, break immediately and conclude the string is not a palindrome ([GeeksforGeeks][1]).
3. **Completion Check:**
   If all comparisons succeed until pointers cross or meet, the string is confirmed as a palindrome ([Programiz][4]).

### Complexity

* **Time:** O(n), where n is the string length, because each character is compared at most once ([GeeksforGeeks][1]).
* **Space:** O(1), only constant extra space for index pointers ([TheServerSide][5]).

### Code

```java
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "aammaa";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome 
            ? "String is Palindrome" 
            : "String is not Palindrome");
    }
}
```

#### Example Output

```
String is Palindrome
```

---

## 💡 Problem 2: Detect Duplicate Elements in an Array

### Approach

1. **Brute‑Force Nested Loops:**
   For each element, scan subsequent elements to count occurrences; add to a result set if count > 1 ([GeeksforGeeks][2]).
2. **HashSet Tracking (Optimized):**
   Maintain a `Set<Integer> seen` to record first encounters and a `List<Integer> duplicates` to collect any element that fails to add (i.e., is already present) ([Baeldung][6]).
3. **Result Display:**
   Print the `Set` for unique duplicates and the `List` for all repeated entries, demonstrating both methods ([Java Revisited][7]).

### Complexity

* **Time:**

  * Nested loops: O(n²) in the worst case ([GeeksforGeeks][2]).
  * HashSet method: O(n) on average due to constant‑time set operations ([Baeldung][6]).
* **Space:**

  * Nested loops: O(1) extra space.
  * HashSet/List: O(n) worst‑case to store seen elements and duplicates ([TheServerSide][8]).

### Code

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicateElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};

        // Method 1: Nested loops + Set for unique duplicates
        Set<Integer> duplicateSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > 1) {
                duplicateSet.add(nums[i]);
            }
        }
        System.out.println("Unique duplicates: " + duplicateSet);

        // Method 2: HashSet + List for all duplicates
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                duplicateList.add(num);
            }
        }
        System.out.println("All duplicates: " + duplicateList);
    }
}
```

#### Example Output

```
Unique duplicates: [2, 3]
All duplicates: [2, 3]
```

---

## 🎯 Takeaways

* Two‑pointer traversal provides an in‑place, linear‑time solution for palindrome checking without extra memory allocations ([GeeksforGeeks][1]).
* Brute‑force nested loops are simple but inefficient at O(n²); hash‑based methods deliver O(n) performance at the cost of O(n) extra space ([Baeldung][6]).
* Understanding both naïve and optimized patterns equips you for a variety of interview and real‑world scenarios.

---

✨ On to Day 50! 🚀
## 🌟 Day 50: Solved Problems (May 19, 2025)

Wrapping up today’s session, we tackled two essential data-structure–and–string challenges in Java: finding the longest common prefix among a set of strings using both horizontal and vertical scanning, and implementing a simple array-backed stack with standard push, pop, and peek operations. These exercises reinforce your understanding of string traversal techniques, substring manipulation, and basic stack mechanics—foundational skills for coding interviews and everyday software development.

---

## 🚀 Today’s Challenges

1️⃣ **Longest Common Prefix**
Given an array of strings, determine the longest prefix shared by all strings using both horizontal shrink‑and‑chop and vertical character‑by‑character scanning.

2️⃣ **Array‑Backed Stack**
Implement a stack with `push`, `pop`, and `peek` methods on a fixed‑size array, handling overflow and underflow scenarios gracefully.

---

## 💡 Problem 1: Longest Common Prefix

### Approach

1. **Horizontal Scanning**

   * Initialize the prefix to the first string.
   * For each subsequent string, repeatedly shorten the prefix (by dropping its last character) until the current string starts with that prefix.
   * Continue until all strings have been processed, or the prefix becomes empty.

2. **Vertical Scanning**

   * Compare characters column‑by‑column across all strings.
   * At index `i`, ensure every string has the same character as the first string; if any mismatch or one string ends, return the substring up to `i`.

### Complexity

* **Time:**

  * Horizontal: O(S), where S is the sum of all characters across strings (worst‑case you shrink and compare repeatedly).
  * Vertical: O(S) too, since you examine each character at most once.
* **Space:** O(1) extra beyond the input and the prefix.

### Code

```java
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String horizontal = longestCommonPrefix(strs);
        String vertical   = longestCommonPrefixVertical(strs);
        System.out.println("Horizontal LCP: " + horizontal);
        System.out.println("Vertical   LCP: " + vertical);
    }

    // Horizontal shrink-and-check
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // Vertical character-by-character
    public static String longestCommonPrefixVertical(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
```

#### Example Output

```
Horizontal LCP: fl
Vertical   LCP: fl
```

---

## 💡 Problem 2: Array‑Backed Stack

### Approach

1. **Fixed‑Size Array**

   * Maintain an integer array of capacity `maxSize`.
   * Use an index `top` starting at –1 to track the stack’s current top.

2. **push(element)**

   * Check for overflow (`top == maxSize – 1`).
   * Increment `top` and assign the element.

3. **pop()**

   * Check for underflow (`top == -1`).
   * Return the element at `top` and decrement it.

4. **peek()**

   * Return the element at `top` without modifying the stack; handle empty state.

### Complexity

* **Time:** O(1) for each operation (`push`, `pop`, `peek`).
* **Space:** O(n) to hold up to `maxSize` elements.

### Code

```java
public class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize    = maxSize;
        this.stackArray = new int[maxSize];
        this.top        = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow! cannot push element " + element);
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed element " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! cannot pop");
            return -1;
        }
        int popped = stackArray[top--];
        System.out.println("Popped element " + popped);
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! cannot peek");
            return -1;
        }
        return stackArray[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);  // overflow
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();    // underflow
    }
}
```

#### Example Output

```
Pushed element 1
Pushed element 2
Pushed element 3
Pushed element 4
Pushed element 5
Stack overflow! cannot push element 6
Top element: 5
Popped element 5
Popped element 4
Popped element 3
Popped element 2
Popped element 1
Stack underflow! cannot pop
```

---

## 🎯 Takeaways

* Horizontal vs. vertical strategies both run in linear time for longest‑prefix problems but differ in string‑comparison patterns.
* Array‑based stacks deliver constant‑time operations; always guard against overflow/underflow in fixed‑capacity designs.

---

✨ On to Day 51! 🚀
## 🌟 Day 51: Solved Problems (May 20, 2025)

Today’s challenges focused on exploring primality, finding the maximum subarray sum, and counting words in a sentence. These problems help refine fundamental algorithmic techniques like prime checking, Kadane’s algorithm for subarray optimization, and text parsing.

---

## 🚀 Today’s Challenges

1️⃣ **Prime or Not**
2️⃣ **Maximum Subarray Sum**
3️⃣ **Word Count**

---

## 💡 Problem 1: Prime or Not

### Description

Write a program to check if a given number is prime.

### Approach

* A prime number is divisible only by 1 and itself.
* Skip even numbers (after 2) and check divisibility up to the square root of the number.

### Complexity

* **Time:** O(√n)
* **Space:** O(1)

### Code

```java
public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 29;
        System.out.println(num + (isPrime(num) ? " is Prime." : " is Not Prime."));
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
```

---

## 💡 Problem 2: Maximum Subarray Sum

### Description

Find the maximum sum of any contiguous subarray within an array of integers.

### Approach

* **Kadane’s Algorithm:**

  * Start with the first element as both the current and maximum sum.
  * Extend the current subarray or start anew with the current element, based on which yields a greater sum.
  * Update the maximum sum at each step.

### Complexity

* **Time:** O(n)
* **Space:** O(1)

### Code

```java
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int currentSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int extendSum = currentSum + nums[i];

            currentSum = extendSum < nums[i] ? nums[i] : extendSum;
            maxSum = maxSum < currentSum ? currentSum : maxSum;
        }
        System.out.println("Maximum Sub Array Sum : " + maxSum);
    }
}
```

#### Example Output

```
Maximum Sub Array Sum : 6
```

---

## 💡 Problem 3: Word Count

### Description

Count the number of words in a sentence. A word is defined as any contiguous sequence of alphanumeric characters.

### Approach

1. **Using String Split:**

   * Trim the sentence and split it using whitespace.

2. **Manual Alphanumeric Check:**

   * Iterate over the characters, toggling a flag when entering or exiting a word.

### Complexity

* **Time:** O(n)
* **Space:** O(1) extra beyond the input.

### Code

```java
public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count words";
        int wordCount = countWords(sentence);

        String words[] = sentence.trim().split("\\s+");

        System.out.println("Number of words in the sentence: " + wordCount);
        System.out.println("Number of words in the sentence: " + words.length);
    }

    public static int countWords(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }

        int count = 0;
        boolean inWord = false;

        for (int i = 0, n = s.length(); i < n; i++) {
            char c = s.charAt(i);
            boolean isAlnum = (c >= 'A' && c <= 'Z')
                    || (c >= 'a' && c <= 'z')
                    || (c >= '0' && c <= '9');

            if (isAlnum) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}
```

#### Example Output

```
Number of words in the sentence: 8
Number of words in the sentence: 8
```

---

## 🎯 Takeaways

* Efficient prime-checking skips even numbers and reduces iterations to O(√n).
* Kadane’s algorithm is a go-to solution for maximum subarray problems in linear time.
* Text parsing can be approached flexibly with split functions or manual checks.

---

✨ Keep the momentum alive! See you on Day 52. 🚀

## 🌟 Day 52: Solved Problems (May 21, 2025)

Today's challenge focuses on merging two sorted arrays without using extra space. This problem emphasizes in-place modifications and efficient merging techniques, making it highly relevant for memory-constrained applications.

---

## 🚀 Problem: Merge Two Sorted Arrays Without Extra Space

### Description

Given two sorted arrays `a[]` and `b[]` of sizes `n` and `m` respectively, merge them in sorted order **without using extra space**.

* Modify `a[]` to contain the first `n` smallest elements.
* Modify `b[]` to contain the remaining `m` largest elements.

### Examples

#### Example 1

**Input:**
`a[] = [2, 4, 7, 10]`
`b[] = [2, 3]`

**Output:**

```
Array A: [2, 2, 3, 4]
Array B: [7, 10]
```

---

#### Example 2

**Input:**
`a[] = [1, 5, 9, 10, 15, 20]`
`b[] = [2, 3, 8, 13]`

**Output:**

```
Array A: [1, 2, 3, 5, 8, 9]
Array B: [10, 13, 15, 20]
```

---

#### Example 3

**Input:**
`a[] = [0, 1]`
`b[] = [2, 3]`

**Output:**

```
Array A: [0, 1]
Array B: [2, 3]
```

---

## 💡 Approach

1. **Start from the Last Element of `b[]`:**
   Compare the last element of `b[]` with the largest element of `a[]`.

2. **Swap and Shift:**
   If the largest element of `a[]` is greater, shift the elements in `a[]` to make space and insert the element from `b[]`.

3. **In-Place Replacement:**
   Move the displaced element from `a[]` into `b[]`.

4. **Iterate Backwards:**
   Repeat this process for all elements of `b[]`.

### Complexity

* **Time:** O((n + m) \* log(n + m)) due to in-place sorting during the iteration.
* **Space:** O(1) (no extra space used).

---

## 📄 Code

```java
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Two sorted arrays
        int[] arrayA = { 1, 5, 9, 10, 15, 20 }; // Larger array
        int[] arrayB = { 2, 3, 8, 13 }; // Smaller array

        // Start from the last element of arrayB
        for (int indexB = arrayB.length - 1; indexB >= 0; indexB--) {
            // If the last element of arrayA is greater than the current element in arrayB
            if (arrayA[arrayA.length - 1] > arrayB[indexB]) {
                int lastElementA = arrayA[arrayA.length - 1]; // Store the last element of arrayA
                int indexA = arrayA.length - 2; // Pointer to second last element of arrayA

                // Shift elements in arrayA to make room for arrayB[indexB]
                while (indexA >= 0 && arrayA[indexA] > arrayB[indexB]) {
                    arrayA[indexA + 1] = arrayA[indexA];
                    indexA--;
                }

                // Place the current element of arrayB in the correct position in arrayA
                arrayA[indexA + 1] = arrayB[indexB];

                // Move the last element of arrayA to arrayB
                arrayB[indexB] = lastElementA;
            }
        }

        // Print the merged arrays
        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
    }
}
```

---

## 🎯 Key Takeaways

1. **In-Place Algorithms:**
   Avoiding extra space is a common constraint in real-world applications, especially for memory-constrained systems.

2. **Sorting in Chunks:**
   By iterating backwards and making swaps, the arrays can be efficiently merged while preserving the sorted order.

3. **Edge Cases:**
   Handle edge cases where arrays have overlapping or completely distinct ranges.

---

✨ Keep pushing forward! See you on Day 53. 🚀

