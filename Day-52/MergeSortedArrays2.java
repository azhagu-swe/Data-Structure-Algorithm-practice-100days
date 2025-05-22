import java.util.Arrays;

public class MergeSortedArrays2 {
    public static void main(String[] args) {
        int[] arrayA = {1, 5, 9, 10, 15, 20};
        int[] arrayB = {2, 3, 8, 13};

        mergeArrays(arrayA, arrayB);

        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
    }

    private static void mergeArrays(int[] arrayA, int[] arrayB) {
        int totalLength = arrayA.length + arrayB.length;
        int gap = nextGap(totalLength);

        // Loop until the gap becomes 0
        while (gap > 0) {
            int i = 0;

            // Compare elements in the first array
            while (i + gap < arrayA.length) {
                if (arrayA[i] > arrayA[i + gap]) {
                    // Swap if out of order
                    int temp = arrayA[i];
                    arrayA[i] = arrayA[i + gap];
                    arrayA[i + gap] = temp;
                }
                i++;
            }

            // Compare elements between the two arrays
            int j = gap > arrayA.length ? gap - arrayA.length : 0;
            while (i < arrayA.length && j < arrayB.length) {
                if (arrayA[i] > arrayB[j]) {
                    // Swap if out of order
                    int temp = arrayA[i];
                    arrayA[i] = arrayB[j];
                    arrayB[j] = temp;
                }
                i++;
                j++;
            }

            // Compare elements in the second array
            j = 0;
            while (j + gap < arrayB.length) {
                if (arrayB[j] > arrayB[j + gap]) {
                    // Swap if out of order
                    int temp = arrayB[j];
                    arrayB[j] = arrayB[j + gap];
                    arrayB[j + gap] = temp;
                }
                j++;
            }

            // Reduce the gap for the next iteration
            gap = nextGap(gap);
        }
    }

    // Calculate the next gap value
    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap + 1) / 2;
    }
}
