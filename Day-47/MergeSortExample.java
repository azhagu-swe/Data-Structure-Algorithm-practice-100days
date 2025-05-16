import java.util.Arrays;

public class MergeSortExample {

    public static void main(String[] args) {
        int[] numbers = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Unsorted array: " + Arrays.toString(numbers));

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }

    /**
     * Recursively splits the array into halves, sorts each half, and merges them.
     *
     * @param array      The array to sort.
     * @param startIndex The starting index of the subarray.
     * @param endIndex   The ending index of the subarray.
     */
    private static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            // Find the midpoint to split the array
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            // Sort left half
            mergeSort(array, startIndex, midIndex);
            // Sort right half
            mergeSort(array, midIndex + 1, endIndex);

            // Merge the two sorted halves
            merge(array, startIndex, midIndex, endIndex);
        }
    }

    /**
     * Merges two sorted subarrays into a single sorted subarray.
     *
     * @param array      The array containing the subarrays to merge.
     * @param startIndex The starting index of the first sorted subarray.
     * @param midIndex   The ending index of the first sorted subarray (midpoint).
     * @param endIndex   The ending index of the second sorted subarray.
     */
    private static void merge(int[] array, int startIndex, int midIndex, int endIndex) {
        int leftSize = midIndex - startIndex + 1;
        int rightSize = endIndex - midIndex;

        // Create temporary arrays to hold the two halves
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[startIndex + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = array[midIndex + 1 + j];
        }

        // Merge the temp arrays back into the main array
        int leftIndex = 0; // Initial index of left subarray
        int rightIndex = 0; // Initial index of right subarray
        int mainIndex = startIndex; // Initial index of merged subarray

        // Compare elements from leftArray and rightArray, copying the smaller into
        // array
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[mainIndex++] = leftArray[leftIndex++];
            } else {
                array[mainIndex++] = rightArray[rightIndex++];
            }
        }

        // Copy any remaining elements of leftArray (if any)
        while (leftIndex < leftSize) {
            array[mainIndex++] = leftArray[leftIndex++];
        }

        // Copy any remaining elements of rightArray (if any)
        while (rightIndex < rightSize) {
            array[mainIndex++] = rightArray[rightIndex++];
        }
    }
}
