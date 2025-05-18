// Detect Duplicate Elements in an Array
// Write a Java program to find all duplicate elements in an array.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicateElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 3 };
        Set<Integer> duplicateNumber = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] == nums[j + 1])
                    count++;
            }
            if (count > 1)
                duplicateNumber.add(nums[i]);

        }
        System.out.println(duplicateNumber.toString());

        Set<Integer> seen=new HashSet<>();
        List<Integer> duplicate=new ArrayList<>();
        for(int num:nums){
            if(!seen.add(num)) duplicate.add(num);
        }
        System.out.println(duplicate);
        

    }

}
