import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num); // Store nums1 elements in set1
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num); // Add common elements to result
            }
        }

        // Convert the result set to an array
        int[] intersection = new int[result.size()];
        int i = 0;
        for (int num : result) {
            intersection[i++] = num;
        }

        return intersection;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

