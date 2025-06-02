// 5. Detect Duplicate Elements in an Array
// Write a Java program to find all duplicate elements in an array.

// To detect duplicate elements in an array in Java, you can use various approaches such as using a HashSet, sorting the array, or using nested loops. Here’s a Java program to detect duplicate elements using a HashSet:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateElementsDetector {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 3,2 }; // Example array with duplicates

        Set<Integer> duplicateElement = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        Arrays.stream(nums).forEach(num -> {
            if (!duplicateElement.add(num)) {
                dup.add(num);
            }

        });
        System.out.println(dup);

        Set<Integer> dupNumber=new HashSet<>();
        // Manual way

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    dupNumber.add(nums[i]);
                    break;
                }
            }
        }
        System.out.println(dupNumber);
    }

}
