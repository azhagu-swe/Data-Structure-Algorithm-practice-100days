import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for (int i = number; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            for (int i = number; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j <= number - i)
                        System.out.print(" ");
                    else
                        System.out.print(j);
                }
                System.out.println();
            }
            
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j <= number - i)
                        System.out.print(" ");
                    else
                        System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}