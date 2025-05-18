public class FindDuplicatesBrute {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 3 };
        printDistinctDuplicates(nums);
    }

    /**
     * Scans pairwise and prints each value exactly once if it appears more than once.
     *
     * @param nums Input array of ints
     */
    public static void printDistinctDuplicates(int[] nums) {
        System.out.print("Duplicates: ");
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // First, check if nums[i] has any match later:
            boolean hasMatch = false;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    hasMatch = true;
                    break;
                }
            }
            if (!hasMatch) {
                continue;  // no duplicate for this value
            }

            // Next, ensure we haven't printed nums[i] already:
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
    }
}

