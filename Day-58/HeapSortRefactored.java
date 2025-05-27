import java.util.Arrays;

public class HeapSortRefactored {
    public static void main(String[] args) {
        int[] unsortedArray = {4, 10, 3, 5, 1,2};
        sortArrayUsingHeap(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }

    /**
     * Sorts the given array using the Heap Sort algorithm.
     *
     * @param inputArray The array to be sorted.
     */
    public static void sortArrayUsingHeap(int[] inputArray) {
        int totalElements = inputArray.length;

        // Step 1: Build a Max Heap
        for (int currentNodeIndex = totalElements / 2 - 1; currentNodeIndex >= 0; currentNodeIndex--) {
            buildMaxHeap(inputArray, totalElements, currentNodeIndex);
        }

        // Step 2: Extract elements one by one from the heap
        for (int lastElementIndex = totalElements - 1; lastElementIndex >= 0; lastElementIndex--) {
            // Move the current root (largest element) to the end
            swapElements(inputArray, 0, lastElementIndex);

            // Rebuild the heap for the remaining elements
            buildMaxHeap(inputArray, lastElementIndex, 0);
        }
    }

    /**
     * Ensures the subtree rooted at the given index satisfies the Max Heap property.
     *
     * @param heapArray       The array representing the heap.
     * @param heapSize        The size of the heap (number of active elements).
     * @param rootNodeIndex   The index of the root node for the current subtree.
     */
    private static void buildMaxHeap(int[] heapArray, int heapSize, int rootNodeIndex) {
        int largestElementIndex = rootNodeIndex;
        int leftChildIndex = 2 * rootNodeIndex + 1;
        int rightChildIndex = 2 * rootNodeIndex + 2;

        // Check if the left child is larger than the root
         if (leftChildIndex < heapSize && heapArray[leftChildIndex] > heapArray[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }

        // Check if the right child is larger than the largest so far
        if (rightChildIndex < heapSize && heapArray[rightChildIndex] > heapArray[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }

        // If the largest is not the root, swap and heapify the affected subtree
        if (largestElementIndex != rootNodeIndex) {
            swapElements(heapArray, rootNodeIndex, largestElementIndex);
            buildMaxHeap(heapArray, heapSize, largestElementIndex);
        }
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param array         The array where the elements will be swapped.
     * @param firstIndex    The index of the first element.
     * @param secondIndex   The index of the second element.
     */
    private static void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temporaryValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporaryValue;
    }
}
