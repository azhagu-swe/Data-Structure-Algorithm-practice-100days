import java.util.Scanner;

public class CountVowelsConstant {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter you sentence : ");
            String sentence = scanner.nextLine().toLowerCase();
            int vowels = 0, constant = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if ('a' == sentence.charAt(i) || 'e' == sentence.charAt(i) || 'i' == sentence.charAt(i)
                        || 'o' == sentence.charAt(i)
                        || 'u' == sentence.charAt(i)) {
                    vowels++;

                } else if (sentence.charAt(i) <= 122 && sentence.charAt(i) >= 97) {
                    constant++;
                }
            }
            System.out.println("Vowels : " + vowels + " Constants : " + constant);
        }
    }

}
