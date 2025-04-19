import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 25, 54, 44, 2, 34 };
        System.out.println("insertion Sort : " + Arrays.toString(insertionSort(arr)));

    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0&&key < arr[j] ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

}
