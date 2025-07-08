public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 29;
        System.out.println(num + (isPrime(num) ? " is Prime." : " is Not Prime."));
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        for (int i = 3; i * i <= num; i+=2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
