import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; // Import Collections for sorting
import java.util.List;

public class MajorityElement {
    // Java program for finding elements appearing more than n/3 times

    /**
     * Finds elements in an array that appear more than floor(n/3) times.
     * Uses an extended Boyer-Moore Voting Algorithm.
     *
     * @param arr The input array of integers.
     * @return A sorted List containing the majority elements.
     */
    static List<Integer> findMajority(int[] arr) {
        // Get the total number of elements in the array
        int n = arr.length;

        // --- Step 1: Find up to two potential candidates ---
        // We need two 'slots' because at most two numbers can appear more than n/3 times.
        // Think of ele1, ele2 as potential popular numbers.
        // Think of cnt1, cnt2 as vote counts for these numbers.

        // Initialize candidates and their counts.
        // Note: Using -1 assumes -1 is not a possible element in the input array.
        // A more robust solution might handle the first few elements differently.
        int ele1 = -1; // Candidate 1 slot (initially empty)
        int ele2 = -1; // Candidate 2 slot (initially empty)
        int cnt1 = 0;  // Vote count for candidate 1
        int cnt2 = 0;  // Vote count for candidate 2

        // First pass through the array to find potential candidates
        // Imagine each number casts a vote.
        for (int ele : arr) {

            // Case 1: If the current element matches candidate 1...
            if (ele1 == ele) {
                cnt1++; // Give a vote to candidate 1
            }

            // Case 2: If the current element matches candidate 2...
            else if (ele2 == ele) {
                cnt2++; // Give a vote to candidate 2
            }

            // Case 3: If candidate 1's vote count is zero...
            else if (cnt1 == 0) {
                ele1 = ele; // Make the current element the new candidate 1
                cnt1 = 1;   // Start its vote count at 1
            }

            // Case 4: If candidate 2's vote count is zero...
            else if (cnt2 == 0) {
                ele2 = ele; // Make the current element the new candidate 2
                cnt2 = 1;   // Start its vote count at 1
            }

            // Case 5: If the element doesn't match either candidate,
            // and both candidates have votes...
            else {
                // Decrease the vote count for both candidates.
                // It's like this element cancels out one vote for each candidate.
                cnt1--;
                cnt2--;
            }
        } // End of the first pass. ele1 and ele2 now hold the *potential* majority candidates.

        // --- Step 2: Verify the candidates ---
        // The first pass only gives us *potential* candidates.
        // We need to count their actual occurrences to be sure.

        List<Integer> res = new ArrayList<>(); // List to store the final result
        cnt1 = 0; // Reset count for candidate 1
        cnt2 = 0; // Reset count for candidate 2

        // Second pass through the array to count actual occurrences of ele1 and ele2
        for (int ele : arr) {
            if (ele1 == ele) {
                cnt1++; // Count occurrences of candidate 1
            }
            // Use 'else if' here ONLY if ele1 and ele2 could potentially be the same
            // If they are guaranteed different after pass 1 (which they might not be),
            // separate 'if's are fine. Let's count independently just in case.
            if (ele2 == ele) {
                cnt2++; // Count occurrences of candidate 2
            }
        }

        // Check if candidate 1's count is more than n/3
        if (cnt1 > n / 3) {
            res.add(ele1); // Add candidate 1 to the result list
        }
        // Check if candidate 2's count is more than n/3
        // AND make sure we don't add the same element twice if ele1 and ele2 ended up being the same.
        if (cnt2 > n / 3 && ele1 != ele2) {
            res.add(ele2); // Add candidate 2 to the result list
        }

        // --- Step 3: Sort the result ---
        // The problem requires the result array to be sorted.
        Collections.sort(res); // Use the built-in sort method

        // Return the list of confirmed majority elements
        return res;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 2, 2, 3, 1, 3, 2, 1, 1 };
        System.out.print("Input: " + Arrays.toString(arr1) + " -> Output: ");
        List<Integer> res1 = findMajority(arr1);
        System.out.println(res1); // Expected: [1, 2]

        // Example 2
        int[] arr2 = { -5, 3, -5 };
        System.out.print("Input: " + Arrays.toString(arr2) + " -> Output: ");
        List<Integer> res2 = findMajority(arr2);
        System.out.println(res2); // Expected: [-5]

        // Example 3
        int[] arr3 = { 3, 2, 2, 4, 1, 4 };
        System.out.print("Input: " + Arrays.toString(arr3) + " -> Output: ");
        List<Integer> res3 = findMajority(arr3);
        System.out.println(res3); // Expected: []
    }
}