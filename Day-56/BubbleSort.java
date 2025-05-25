import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        // bubbleSort(data);
        bubbleSortUsingForLoop(data);
        System.out.println(Arrays.toString(data));

    }

    private static void bubbleSortUsingForLoop(int[] data) {
        if (data.length <= 0)
            return;
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSort(int[] data) {
        if (data.length <= 0)
            return;
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    // with temp variable

                    // int temp = data[i];
                    // data[i] = data[i + 1];
                    // data[i + 1] = temp;

                    // without temp variable
                    isSorted = true;
                    data[i] = data[i] + data[i + 1];
                    data[i + 1] = data[i] - data[i + 1];
                    data[i] = data[i] - data[i + 1];

                }

            }

        }
    }
}