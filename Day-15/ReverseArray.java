import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, -5, -6, -7, 0 };
        int[] reverseNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverseNumber[numbers.length - 1 - i] = numbers[i];
        }
        System.out.println("Reverse Array : " + Arrays.toString(reverseNumber));

    }

}
