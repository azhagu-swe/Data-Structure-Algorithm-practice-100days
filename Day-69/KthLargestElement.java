import java.util.Random;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(numbers, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }

    private static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        
        int partitionIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                swap(nums, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(nums, partitionIndex, right);

        if (partitionIndex == k) return nums[partitionIndex];
        else if (partitionIndex < k) return quickSelect(nums, partitionIndex + 1, right, k);
        else return quickSelect(nums, left, partitionIndex - 1, k);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
