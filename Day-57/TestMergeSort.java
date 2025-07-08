import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(arr, leftIndex, middleIndex);
            mergeSort(arr, middleIndex + 1, rightIndex);

            merge(arr, leftIndex, middleIndex, rightIndex);

        }

    }

    private static void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {

        // copy the temp left right sub array

        int leftSubArraySize = middleIndex - leftIndex + 1;
        int rightSubArraySize = rightIndex - middleIndex;

        int[] leftSubArrayBuffer = new int[leftSubArraySize];
        int[] rightSubArrayBuffer = new int[rightSubArraySize];

        // copy the temp array
        for (int i = 0; i < leftSubArraySize; i++) {
            leftSubArrayBuffer[i] = arr[leftIndex + i];

        }
        for (int i = 0; i < rightSubArraySize; i++) {
            rightSubArrayBuffer[i] = arr[middleIndex + i + 1];

        }

        // copy the main array
        int leftPointer = 0, rightPointer = 0, mergerPointer = leftIndex;
        // copy the smaller value
        while (leftPointer < leftSubArraySize && rightPointer < rightSubArraySize) {
            if (leftSubArrayBuffer[leftPointer] <= rightSubArrayBuffer[rightPointer]) {
                arr[mergerPointer++] = leftSubArrayBuffer[leftPointer++];
            } else {
                arr[mergerPointer++] = rightSubArrayBuffer[rightPointer++];

            }

        }

        // copy the left over
        while (leftPointer < leftSubArraySize) {
            arr[mergerPointer++] = leftSubArrayBuffer[leftPointer++];

        }
        while (rightPointer < rightSubArraySize) {
            arr[mergerPointer++] = rightSubArrayBuffer[rightPointer++];

        }

    }

}
