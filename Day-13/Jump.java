class Jump {
   
    public static void main(String[] args) {
        int[] test1={2,3,1,1,4};
        int[] test2={3,2,1,0,4};
       System.out.println(canJump(test1));
       System.out.println(canJump(test2)); 
    }

    public static boolean canJump(int[] nums) {
        int mx = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (mx < i) {
                return false;
            }
            mx = Math.max(mx, i + nums[i]);
        }
        return true;
    }
}