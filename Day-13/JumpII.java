
public class JumpII {

    public static void main(String[] args) {
        int[] test1 = { 2, 3, 1, 1, 4 };
        int[] test2 = { 3, 2, 1, 0, 4 };
        System.out.println(jump(test1));
        System.out.println(jump(test2));
    }

    public static int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int farthest = 0;

        // Start an implicit BFS.
        for (int i = 0; i < nums.length - 1; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                ++ans;
                break;
            }
            if (i == end) { // Visited all the items on the current level.
                ++ans; // Increment the level.
                end = farthest; // Make the queue size for the next level.
            }
        }

        return ans;
    }

}
