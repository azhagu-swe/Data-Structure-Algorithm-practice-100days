import java.util.Arrays;

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        selectionSort(data);
        System.out.println(Arrays.toString(data));

    }

    private static void selectionSort(int[] data) {
        if (data.length <= 0)
            return;
        for (int step = 0; step < data.length; step++) {
            int minIndex = step;
            for (int i = step+1; i < data.length; i++) {
                if (data[i] < data[minIndex]) {
                    minIndex = i;
                }

            }
            int temp = data[minIndex];
            data[minIndex] = data[step];
            data[step] = temp;

        }
    }

}
