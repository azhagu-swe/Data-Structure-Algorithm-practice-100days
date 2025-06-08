import java.util.Arrays;

public class MergeSorter {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        merge(arr1, arr2);
        System.out.println("Merged Array 1: " + Arrays.toString(arr1));
        System.out.println("Merged Array 2: " + Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        for (int i = 0; i < m; i++) {
            if (arr1[i] > arr2[0]) {
                // Swap elements
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Re-sort arr2 to maintain order
                int first = arr2[0];
                int k;
                for (k = 1; k < n && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }
}
