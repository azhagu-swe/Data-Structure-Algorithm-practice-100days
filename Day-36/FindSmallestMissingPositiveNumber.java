import java.util.Arrays;

public class FindSmallestMissingPositiveNumber {
    public static void main(String[] args) {
        int arr[] = { 2, -3, 4, 1, 1, 7 };

        // sort(arr);
        System.out.println(Arrays.toString(arr));
        int result = smallestMissingPositiveNumber(arr);
        System.out.println(result);

    }

    private static int smallestMissingPositiveNumber(int[] arr) {
        int n = arr.length;

        // To mark the occurrence of elements
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {

            // if element is in range from 1 to n
            // then mark it as visited
            if (arr[i] > 0 && arr[i] <= n)
                vis[arr[i] - 1] = true;
        }

        // Find the first element which is unvisited
        // in the original array
        for (int i = 1; i <= n; i++) {
            if (!vis[i - 1]) {
                return i;
            }
        }
        // if all elements from 1 to n are visited
        // then n+1 will be first positive missing number
        return n + 1;
    }

    private static void sort(int[] arr) {
        boolean sort = true;
        while (sort) {
            sort = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort = true;
                }
            }
        }
    }

}
