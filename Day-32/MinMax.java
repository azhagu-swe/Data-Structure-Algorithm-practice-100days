

// Given an array arr[] denoting heights of N towers and a positive integer K.

// For each tower, you must perform exactly one of the following operations exactly once.

// Increase the height of the tower by K
// Decrease the height of the tower by K
// Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

// You can find a slight modification of the problem here.
// Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

// Examples :
public class MinMax {
    static int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;

        int res = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {

            if (arr[i] - k < 0) {
                continue;
            }

            int minH = arr[0] + k < arr[i] - k ? arr[0] + k : arr[i] - k;

            int maxH = arr[i - 1] + k > arr[n - 1] - k ?arr[i - 1] + k :arr[n - 1] - k;

            res = res < (maxH - minH) ? res : maxH - minH;

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 8, 10 };
        int k1 = 2;
        System.out.println(getMinDiff(arr1, k1));
    }
}
