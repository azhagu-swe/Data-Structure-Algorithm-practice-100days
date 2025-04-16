
public class MinMaxInArray {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, -5, -6, -4, 0 };
        int min = numbers[0], max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            else if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("Min In Array : " + min);
        System.out.println("Max In Array : " + max);

    }

}
