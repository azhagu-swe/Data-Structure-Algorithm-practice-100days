import java.util.Arrays;

public class ArraySortingDuplicate {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 3, 3, 3 };

        int k = 2;

        for (int i = 2; i < nums.length; i++) {

            if(nums[i] !=nums[k-2]){
                nums[k]=nums[i];
                k++;

            }
        }
        Arrays.stream(nums,0,k).forEach(num->System.out.print(num +" "));

    }
}