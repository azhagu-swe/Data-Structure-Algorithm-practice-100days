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

* ✅ Manual loop comparison method to check if "gold" exists as a substring.
* ✅ Regex using `<span>\bgold\b</span>` to detect "gold" as a whole word.
* ✅ Regex using `<span>Pattern.compile("gold")</span>` for case-insensitive match anywhere.

**Example:**

* Input: "The golden goose is priceless"
* Output: ✔ Contains "gold"

2️⃣ **Frequency-Based String Compression:**

* Counted all character frequencies (a-z) and printed them in `<span>char + count</span>` format.
* Used a simple `<span>int[26]</span>` array for optimized performance.

**Example:**

* Input: "aaabbccaaa"
* Output: `<span>a6b2c2</span>`

## 📅 Day 4: String Utilities Mastered 🛠️

**📆 Date:***[05/04/2025]*

### ✅ What I Solved Today

1️⃣ **Toggle Each Character Case** 🔄

* **Logic:** For each character, check if it’s lowercase (`<span>'a'</span>`–`<span>'z'</span>`) or uppercase (`<span>'A'</span>`–`<span>'Z'</span>`) and flip by arithmetic:
  * Lower → Upper: `<span>c - 'a' + 'A'</span>`
  * Upper → Lower: `<span>c - 'A' + 'a'</span>`
* **Example:** Input: `<span>"Java123"</span>` → Output: `<span>"jAVA123"</span>`

2️⃣ **Check Anagram** 🧩

* **Logic:** Remove spaces, normalize case, then use a **frequency count** (`<span>int[26]</span>`) to increment for one string and decrement for the other. If all counts return to zero, they are anagrams.
* **Example:**`<span>"listen"</span>`, `<span>"silent"</span>` → Perfectly matched!

3️⃣ **Count Vowels & Consonants** 🔡

* **Logic:** Use a **boolean[26]** lookup for vowels (`<span>a, e, i, o, u</span>`). For each character, if `<span>a</span>`–`<span>z</span>`, check lookup; increment vowel or consonant counter.
* **Example:** Input: `<span>"Hello World"</span>` → Vowels: 3, Consonants: 7

---

_Let's master DSA, one day at a time!_ 🚀💪

## 📅 Day -5: More String Logic 🔠

**📆 Date:***[06/04/2025]*

### ✅ What I Solved Today

1️⃣ **Check Pangram:**

* Verified if a sentence contains every letter of the alphabet (a-z).
* Used a `<span>boolean[26]</span>` array to track occurrences.
* Simple logic: if all positions are `<span>true</span>`, it's a pangram.

2️⃣ **Remove Consecutive Duplicates:**

* Input: "aaabbcccdee"
* Output: "abcde"
* Tracked the previous character using primitive `<span>char</span>`.
* Used `<span>StringBuilder</span>` to build the final result efficiently.

---

## 📅 Day-6: String Challenges

**Date:***[07/04/2025]*

### ✅ What I Solved Today

1️⃣ **Valid Parentheses Matcher**

* Input: A string of characters.
* Task: Check if all `<span>(</span>` have a matching `<span>)</span>` and vice versa.
* Output: Print `<span>0</span>` if valid, `<span>1</span>` if invalid.
* 🔍 Focus: Balance of opening/closing brackets.

2️⃣ **Character-Number Expansion**

* Input: A compressed string like `<span>a1b10</span>`.
* Task: Expand it to full form like `<span>abbbbbbbbbb</span>`.
* ✅ Approach: Parse characters and use count to repeat.
* 💡 Optimized using `<span>StringBuilder</span>` and primitive data types.

### 🌟 Learnings

✔ Practiced real-world string validation scenarios.
✔ Used ASCII index mapping and parsing techniques.
✔ Solidified character handling logic.

✔ **Regex vs Manual Checks:** Regex is clean but understanding manual loops gives more control.
✔ **Frequency Arrays Rock:** For a-z, `<span>int[26]</span>` is perfect. Fast and easy to use.
✔ **Always Optimize Memory:** Use primitives and `<span>StringBuilder</span>` over string concatenation.

## 📅 Day -7: Solving Advanced String Problems

**Date:***[08/04/2025]*

### ✅ What I Accomplished Today

#### 1. **Longest Palindromic Substring**

* **Problem**: Find the longest palindromic substring in a given string.
* **Approach**:
  * Used the **expand around center** technique to identify palindromes by expanding outwards from each character or pair of characters.
  * Compared the lengths of discovered palindromes to find the longest one.
* **Key Learning**:
  * The center expansion approach is efficient with a time complexity of .
  * Debugging palindrome boundaries helped strengthen my understanding of two-pointer algorithms.

#### 2. **Group Anagrams**

* **Problem**: Group a list of strings into groups of anagrams.
* **Approach**:
  * Sorted each string to derive its canonical form (a common key for anagrams).
  * Used a `<span>HashMap</span>` to group words sharing the same canonical form.
  * Collected all groups into a list of lists for the final output.
* **Key Learning**:
  * Sorting and hashing are powerful tools for solving problems involving string patterns.
  * Leveraging `<span>HashMap</span>` for grouping is both efficient and intuitive.

---

### 🏆 Learnings & Observations

1. **Optimized Techniques**:
   * Expand around center for palindromes reduces complexity compared to brute force methods.
   * Sorting strings to identify patterns is a versatile strategy in string problems.
2. **Data Structures**:
   * Used `<span>HashMap</span>` effectively for grouping similar items.
   * Practiced handling edge cases in string-based problems.
3. **Debugging**:
   * Careful consideration of boundaries and indices was crucial, especially in palindromic substring detection.

# 📅Day-8: String Manipulation Challenges

**Date:***[09/04/2025]*

## Problems Solved

### 1️⃣ Reverse Words in a String

* **Problem** : Reverse the order of words in a given string while preserving the word order.
* **Key Learning** : Practiced splitting strings and reversing arrays for efficient word reordering.

### 2️⃣ First Non-Repeating Character

* **Problem** : Identify the first non-repeating character in a string. If all characters repeat, return `-1`.
* **Key Learning** : Reinforced understanding of character frequency counts and order tracking in strings.

---

 **Summary** : Focused on core string operations such as splitting, reversing, and tracking character occurrences. These problems enhanced logical thinking and problem-solving efficiency for string manipulation tasks.

 **Status** : ✅ Completed and Ready for Day-9 Challenges!

# 📅Day 9: Solved Problems

**Date:***[10/04/2025]*

## Problems Solved:

### Problem 1: First Non-Repeating Character

* **Description** : Given a string, find the first non-repeating character. If all characters repeat, return `null`.
* **Example** :
* Input: "zoho"
* Output: `z`

### Problem 2: Convert String to Title Case

* **Description** : Convert a sentence to title case where the first letter of each word is capitalized, and the rest are in lowercase.
* **Example** :
* Input: "hello world"
* Output: "Hello World"

---

Two problems successfully solved focusing on string manipulation and practical text formatting. Ready for more challenges!

---

# 📅Day-10: Frequency & Water Trapping Challenges

**Date:** *[11/04/2025]*

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

*Day-10 complete! Ready to tackle more challenges tomorrow!*

# 📅Day 11: Progress and Learning 🚀

**Date:** *[12/04/2025]*

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
**Date:** *[13/04/2025]*

## Problems Solved:

### Problem 1: Inverted Right-Angled Triangle
- **Description**: Print an inverted triangle of stars, decreasing the number of stars in each row.

### Problem 2: Right-Angled Triangle
- **Description**: Print a triangle of stars, increasing the number of stars in each row.

---

Solved two pattern-printing problems using nested loops. Ready for the next set of challenges!

