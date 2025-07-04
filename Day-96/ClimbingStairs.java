public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println("Ways to climb 2 stairs: " + climbStairs(2)); // 2
        System.out.println("Ways to climb 3 stairs: " + climbStairs(3)); // 3
        System.out.println("Ways to climb 5 stairs: " + climbStairs(5)); // 8
    }
}
