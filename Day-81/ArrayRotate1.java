import java.util.Arrays;

public class ArrayRotate1 {

    // Input: nums = [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]
    // Explanation:
    // rotate 1 steps to the right: [7,1,2,3,4,5,6]
    // rotate 2 steps to the right: [6,7,1,2,3,4,5]
    // rotate 3 steps to the right: [5,6,7,1,2,3,4]

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 10;

        // for(int i=1;i<=k;i++){
        // int temp=arr[arr.length-1];
        // for(int j=arr.length-1;j>=1;j--){
        // arr[j]=arr[j-1];
        // }
        // arr[0]=temp;

        // }
                k = k % arr.length; 

        rotate(arr, 0, arr.length - 1);
        rotate(arr, 0, k-1);

        rotate(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int start, int end) {

        while (start < end) {
            int temp=nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
}