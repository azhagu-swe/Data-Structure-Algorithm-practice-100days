
public class MElement {
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = nums[0];
        for (int i = 0; i < nums.length; i++) {
       
            if (count == 0) {
                candidate = nums[i];
            }
            count +=(nums[i]==candidate)?1:-1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] num={3,2,3};
        System.out.println(majorityElement(num));

    }

}
