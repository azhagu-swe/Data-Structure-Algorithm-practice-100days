public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Index: " + search(nums1, 0)); // Expected: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Index: " + search(nums2, 3)); // Expected: -1

        int[] nums3 = {1};
        System.out.println("Index: " + search(nums3, 0)); // Expected: -1
    }
}
