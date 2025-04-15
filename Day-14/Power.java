public class Power {
    public static void main(String[] args) {
        System.out.println("Power of " + (power(2, 3)));
    }

    private static int power(int base, int power) {
        if (power == 1)
            return base;
        else
            return base * power(base, power - 1);

    }
}
