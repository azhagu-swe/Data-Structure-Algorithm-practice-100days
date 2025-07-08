public class MajorityElement12 {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element in nums1: " + findMajorityElement(nums1)); // Output: 3
        System.out.println("Majority Element in nums2: " + findMajorityElement(nums2)); // Output: 2
    }

    private static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;

        // Phase 1: Find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate (optional if majority element always exists)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return candidate; // Majority element guaranteed to exist
    }
}
