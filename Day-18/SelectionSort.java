import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 25, 54, 44, 2, 34 };
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("selection Sort : " + Arrays.toString(selectionSort.sort(arr)));

    }

    private int[] sort(int[] arr) {
        int temp, min, size = arr.length;
        for (int i = 0; i < size; i++) {
            min = i;
            for (int j = i; j < size; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;

    }

}
