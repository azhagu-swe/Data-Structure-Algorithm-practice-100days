import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();
            System.out.println(number > 0 ?"Binary : "+ intToBinary(number) : "Invalid Value");
            System.out.println("In build Function Integer to Binary : "+Integer.toBinaryString(number));
        }
    }

    private static String intToBinary(int number) {
        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            binary.append(number % 2);
            number /= 2;
        }

        return binary.reverse().toString();
    }
}
