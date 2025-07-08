import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (rightIndex + leftIndex) / 2;
            mergeSort(arr, leftIndex, middleIndex);
            mergeSort(arr, middleIndex + 1, rightIndex);

            merge(arr, leftIndex, middleIndex, rightIndex);

        }

    }

    private static void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
        // copy the temporary buffer
        int leftSubArraySize = middleIndex - leftIndex + 1;
        int rightSubArraySize = rightIndex - middleIndex;

        int[] leftSubArrayBuffer = new int[leftSubArraySize];
        int[] rightSubArrayBuffer = new int[rightSubArraySize];

        for (int i = 0; i < leftSubArraySize; i++) {
            leftSubArrayBuffer[i] = arr[leftIndex + i];

        }
        for (int i = 0; i < rightSubArraySize; i++) {
            rightSubArrayBuffer[i] = arr[middleIndex + i + 1];

        }

        // marge back into main array
        int leftPointer = 0, rightPointer = 0, mergedPointer = leftIndex;

        //compare and copy the smaller element

        while (leftPointer < leftSubArraySize && rightPointer < rightSubArraySize) {
            if (leftSubArrayBuffer[leftPointer] <= rightSubArrayBuffer[rightPointer]) {
                arr[mergedPointer++] = leftSubArrayBuffer[leftPointer++];
            } else {
                arr[mergedPointer++] = rightSubArrayBuffer[rightPointer++];

            }

        }
        // copy leftovers

        while (leftPointer < leftSubArraySize) {
            arr[mergedPointer++] = leftSubArrayBuffer[leftPointer++];

        }
        while (rightPointer < rightSubArraySize) {
            arr[mergedPointer++] = rightSubArrayBuffer[rightPointer++];

        }

    }

}
