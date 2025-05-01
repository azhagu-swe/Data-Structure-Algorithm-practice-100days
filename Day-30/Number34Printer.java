public class Number34Printer {
    public static void main(String[] args) {
        int n = 40;
        System.out.println("Finding numbers in the 3-4 system:");
        for (int i = 1; i <= n; i++) {
            String result = findNthNumber(i);
            System.out.println("The " + i + "th number is: " + result);
        }

    }

    private static String findNthNumber(int i) {
        StringBuilder builder = new StringBuilder();
        while (i > 0) {
            int remainder = (i-1) % 2;
            if (remainder == 0) {
                builder.append('3');
            } else {
                builder.append('4');
            }
            i = (i-1) / 2;

        }
        return builder.toString();
    }

}
