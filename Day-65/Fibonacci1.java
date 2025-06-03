import java.util.Arrays;

public class Fibonacci1 {
    public static void main(String[] args) {
        int n = 10;
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        System.out.println(Arrays.toString(fibo));

    }

}
