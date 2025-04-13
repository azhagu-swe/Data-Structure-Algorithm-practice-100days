import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            for (int i = 0; i <= number; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }
}