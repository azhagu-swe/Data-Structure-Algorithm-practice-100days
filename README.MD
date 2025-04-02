# 100 Days of DSA Challenges

Welcome! I'm embarking on a 100-day journey to sharpen my Data Structures and Algorithms skills. The goal is simple: solve problems daily, find smarter solutions, and become a more efficient coder.

---

📅 **Day -1: Laying the Foundation (Number Problems)**

**Date:** [02/04/2025]

✅ **Today's Focus: Number Manipulation & Logic**

I kicked things off by tackling 10 problems centered around numbers. This helped refresh core mathematical concepts and basic programming logic.

📌 **Problems Solved & Key Concepts:**

1.  **Odd or Even:**
    * **Task:** Determine if a number is odd or even.
    * **Concept:** Basic modulo (`%`) operation.
    * **Optimization:** Used the bitwise AND trick (`num & 1 == 1` for odd) which is often faster.

2.  **Leap Year Checker:**
    * **Task:** Validate if a year is a leap year.
    * **Concept:** Applying multiple conditional logic rules (divisible by 4, not by 100 unless also by 400).
    * **Optimization:** Structured the `if-else` conditions efficiently.

3.  **Reverse and Digit Extractor:**
    * **Task:** Reverse a number, extract its digits, and sum digits/prime digits.
    * **Concept:** Integer arithmetic (`% 10` to get the last digit, `/ 10` to remove it), looping, and using arrays/lists to store digits.

4.  **Duck Number:**
    * **Task:** Check if a number contains a '0' but doesn't start with '0'.
    * **Concept:** Number/string traversal, conditional checks within a loop.
    * **Optimization:** Stopped the check as soon as a '0' was found (after ensuring it's not the leading digit).

5.  **Palindrome Number:**
    * **Task:** Check if a number reads the same forwards and backward.
    * **Concept:** Reversing a number using arithmetic and comparing it with the original.
    * **Optimization:** Built the reversed number efficiently within a `while` loop.

6.  **Fibonacci Series:**
    * **Task:** Generate the Fibonacci sequence up to `n` terms.
    * **Concept:** Understanding recursive patterns and iterative approaches.
    * **Key Insight:** Compared iterative (using loops, generally more efficient space/time-wise for simple cases) vs. recursive solutions.

7.  **Niven Number (Harshad Number):**
    * **Task:** Check if a number is divisible by the sum of its digits.
    * **Concept:** Digit extraction and summation, followed by a divisibility check.

8.  **Special Number:**
    * **Task:** Check if (sum of digits) + (product of digits) equals the original number.
    * **Concept:** Digit manipulation involving both sum and product calculations.
    * **Improvement:** Corrected logical flaws in the initial implementation.

9.  **Prime Number Printer:**
    * **Task:** Print all prime numbers within a given range.
    * **Concept:** Primality testing.
    * **Optimization:** Implemented the **Sieve of Eratosthenes**, a highly efficient algorithm for finding primes up to a certain limit.

10. **Perfect Number:**
    * **Task:** Check if a number equals the sum of its proper divisors.
    * **Concept:** Finding all divisors of a number.
    * **Optimization:** Calculated the sum of divisors efficiently by looping only up to the square root of the number (`O(√N)` complexity).

🏆 **Key Takeaways from Day -1:**

* **Optimize Wisely:** Simple tricks (like bitwise AND for even/odd) can boost performance. Know when to use them!
* **Number Theory Basics:** Divisibility rules, digit manipulation, and prime properties are fundamental tools.
* **Plan Before Coding:** Breaking down problems logically (e.g., how to extract digits, how to check divisibility) makes coding smoother.
* **Iterative vs. Recursive:** Understand the trade-offs, especially for sequences like Fibonacci. Iteration often saves memory/stack space.
* **Efficient Algorithms Exist:** For common tasks like finding primes (Sieve) or divisors (√N loop), standard optimized algorithms are much better than naive approaches.
* **Momentum Matters:** Even this initial session feels like a great start!

🚀 **Plan for Day 0:**

* Dive into **Bit Manipulation** problems for more low-level optimization techniques.
* Begin tackling fundamental **Array-based** DSA problems.
* Continue exploring the efficiency differences between **Recursion and Iteration**.

📌 **How to Follow My Progress:**

* 📂 **Daily Logs:** Check this repository for daily updates.
* 📝 **Code & Explanations:** Solutions will include clear logic and optimization notes.
* 📢 **Shared Learnings:** I'll highlight key insights and techniques regularly.

Stay tuned for Day 0! Let's conquer DSA together! 💻🔥🚀