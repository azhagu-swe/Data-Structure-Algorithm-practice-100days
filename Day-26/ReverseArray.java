// Input: arr = [1, 4, 3, 2, 6, 5]
// Output: [5, 6, 2, 3, 4, 1]
// Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 6, 5 };
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArithmetic(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            // Addition/subtraction swap
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            // XOR swap without a temporary variable
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
        System.out.println(Arrays.toString(arr));

    }

}
