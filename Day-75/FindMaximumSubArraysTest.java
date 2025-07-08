public class FindMaximumSubArraysTest {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // Example array of numbers
        int sum=maximumSubArraySumTest(nums);
        System.out.println(sum);

    }

    private static int maximumSubArraySumTest(int[] nums) {
       int maxEndingHere=nums[0];
       int maxSoFar=nums[0];

       for(int i=1;i<nums.length;i++){
        maxEndingHere=nums[i]<maxEndingHere+nums[i]?maxEndingHere+nums[i]:nums[i];
        maxSoFar=maxEndingHere<maxSoFar?maxSoFar:maxEndingHere;
       }
       return maxSoFar;
    }

}
