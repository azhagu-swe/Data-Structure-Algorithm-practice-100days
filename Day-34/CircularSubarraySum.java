// Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.

// Examples:

// Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
// Output: 22
// Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
// Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
// Output: 23
// Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].
// Input: arr[] = [-1, 40, -14, 7, 6, 5, -4, -1] 
// Output: 52
// Explanation: Circular Subarray [7, 6, 5, -4, -1, -1, 40] has the maximum sum, which is 52.

public class CircularSubarraySum {
    public static void main(String[] args) {
        int arr[] = { 10, -4, 6, -8, 5 };
        System.out.println("Maximum Circular sub Array Sum : " + getCircularSubArraySum(arr));
    }

    private static int getCircularSubArraySum(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currSum=0;
             // Subarray that begins with index i
             for(int j = 0; j < arr.length; j++) {
                
                // Circular index
                int idx = (i + j) % arr.length;
                currSum = currSum + arr[idx];            
                result = Math.max(result, currSum);
            }
        }

        return result;
    }

}