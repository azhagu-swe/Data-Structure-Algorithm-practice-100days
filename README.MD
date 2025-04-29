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

## Problems Solved:

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

## Problems Solved:

### Problem 1: Inverted Right-Angled Triangle

- **Description**: Print an inverted triangle of stars, decreasing the number of stars in each row.

### Problem 2: Right-Angled Triangle

- **Description**: Print a triangle of stars, increasing the number of stars in each row.

---

# Solved two pattern-printing problems using nested loops. Ready for the next set of challenges!

# 📅Day-13: Advanced Jump Game Challenges

**Date:** _[14/04/2025]_

## Problems Solved Today:

### Problem 1: Jump Game II

- **Description**:  
  Given an array of non-negative integers where each element represents the maximum jump length from that index, determine the minimum number of jumps needed to reach the last index.
- **Key Concepts**:
  - Greedy approach with two pointers
  - Tracking the farthest reachable index
  - Incrementing jump count when the current reachable range is exhausted
- **Example**:  
  For the array `[2,3,1,1,4]`, the minimum number of jumps is `2`.

---

### Problem 2: Jump Game I

- **Description**:  
  Given an array of non-negative integers where each element represents the maximum jump length from that index, determine if you can reach the last index. Return `true` if possible; otherwise, return `false`.
- **Key Concepts**:
  - Greedy strategy to track the maximum reachable index
  - Early termination if the current index exceeds the farthest reachable index
- **Example**:  
  For the array `[2,3,1,1,4]`, you can reach the end (output: `true`).  
  For the array `[3,2,1,0,4]`, you cannot reach the end (output: `false`).

---

Focused on advanced jump game variations today, applying greedy techniques to optimize array traversal and decision-making. Ready for the next challenge!

# 🌟 Day 14: Solved Problems (April 15, 2025)

## 🚀 Problems Solved:

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

## 🚀 Problems Solved:

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

## 🚀 Problems Solved:

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

* **Task:** Print various right triangle arrangements using numbers and spaces.

* **Patterns Learned:**

  * Increasing numbers (1 to `n`)

  * Decreasing numbers (`n` to 1\)

  * Repeated rows with identical numbers

  * Right-aligned triangles using leading spaces

* **Example Output:** For `n = 4`, you’ll generate multiple triangular shapes showcasing these variations.

---

### **2️⃣ Pascal’s Triangle**

* **Task:** Build and print Pascal’s triangle with stars (`*`), spanning `2n-1` rows for a diamond effect.

* **Key Learning:**

  * Dynamically adjust the count of symbols to mirror the triangle’s expansion and contraction.

* **Example Output:** For `n = 4`, the star-based Pascal’s triangle flows up then down seamlessly.

---

### **📚 Learning Focus: Time Complexity**

* **O(1):** Constant time — instant operations (e.g., direct element access) 📖

* **O(log n):** Logarithmic — halving search space like Binary Search 🎯

* **O(n):** Linear — full traversal, like scanning an array 🔍

* **O(n²):** Quadratic — nested loops, as in pairwise comparisons 🧩

* **O(2ⁿ):** Exponential — branching recursion, like Tower of Hanoi 🏰

| Complexity | Real-Life Example | Algorithm Example |
| ----- | ----- | ----- |
| **O(1)** | Grab the first book 📖 | Array index access |
| **O(log n)** | Number-guessing game 🎯 | Binary Search |
| **O(n)** | Checking every locker 🔒 | Linear Search |
| **O(n²)** | Student pair comparisons 👩‍🎓👨‍🎓 | Bubble Sort |
| **O(2ⁿ)** | Puzzle permutations 🧩 | Tower of Hanoi |

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

## ✨ Learning Focus:
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

## 🚀 Problems Solved:

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

