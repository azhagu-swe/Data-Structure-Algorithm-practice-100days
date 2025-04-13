import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            for (int i = number; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
