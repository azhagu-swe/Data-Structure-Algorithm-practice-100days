import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 25, 54, 44, 2, 34 };
        int[] test2 = { 1,2,3,4,5,6 };
        System.out.println("Normal Bubble Sort : " + Arrays.toString(bubbleSort(arr)));
        System.out.println("Enhance Bubble Sort : " + Arrays.toString(bubbleSortEnhanceMent(test2)));

    }

    private static int[] bubbleSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;

    }

    private static int[] bubbleSortEnhanceMent(int[] arr) {
        int j = 1;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            j++;
        }
        return arr;

    }

}
