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

## 📌 Follow My Journey

📂 **Daily Logs:** Every day’s progress is documented in this repository.
📝 **Code & Explanations:** I provide detailed breakdowns and step-by-step logic for each problem solved.
📢 **Sharing Insights:** I share key learnings and optimization tips regularly.

Stay tuned for **Day 3**! 💻🔥

---

_Let's master DSA, one day at a time!_ 🚀💪
