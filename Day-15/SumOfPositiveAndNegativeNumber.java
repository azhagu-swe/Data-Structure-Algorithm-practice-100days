public class SumOfPositiveAndNegativeNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, -5, -6, -7, 0 };
        int positive = 0, negative = 0;
        for (int num : numbers) {
            if (num == 0)
                continue;
            if (num > 0)
                positive += num;
            else
                negative += num;
        }
        System.out.println("Positive Number : " + positive);
        System.out.println("Negative Number : " + negative);

    }

}