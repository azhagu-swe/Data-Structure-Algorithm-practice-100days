import java.util.Arrays;

public class MergeSortTrain {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] data, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2; // D
            mergeSort(data, leftIndex, middleIndex); // C1
            mergeSort(data, middleIndex + 1, rightIndex); // C2

            
            merge(data, leftIndex, middleIndex, rightIndex); // M
        }
    }

    private static void merge(int[] data, int leftIndex, int middleIndex, int rightIndex) {

        int leftSubArraySize = middleIndex - leftIndex + 1;
        int rightSubArraySize = rightIndex - middleIndex;

        // Copy data into temporary buffers
        int[] leftSubArrayBuffer = new int[leftSubArraySize];
        int[] rightSubArrayBuffer = new int[rightSubArraySize];


        for (int idx = 0; idx < leftSubArraySize; idx++) {
            leftSubArrayBuffer[idx] = data[leftIndex + idx];
        }
        for (int idx = 0; idx < rightSubArraySize; idx++) {
            rightSubArrayBuffer[idx] = data[middleIndex + 1 + idx];
        }

        // Merge back into main array
        int leftPointer = 0;
        int rightPointer = 0;
        int mergedPointer = leftIndex;

        // Compare and copy the smaller element
        while (leftPointer < leftSubArraySize && rightPointer < rightSubArraySize) {
            if (leftSubArrayBuffer[leftPointer] <= rightSubArrayBuffer[rightPointer]) {
                data[mergedPointer++] = leftSubArrayBuffer[leftPointer++];
            } else {
                data[mergedPointer++] = rightSubArrayBuffer[rightPointer++];
            }
        }

        // Copy any leftovers
        while (leftPointer < leftSubArraySize) {
            data[mergedPointer++] = leftSubArrayBuffer[leftPointer++];
        }
        while (rightPointer < rightSubArraySize) {
            data[mergedPointer++] = rightSubArrayBuffer[rightPointer++];
        }
    }

}
