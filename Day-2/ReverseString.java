import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {
        String sentence;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the Sentence : ");
            sentence = scanner.nextLine();

            System.out.println("Reverse String : " + (reverseString(sentence)));
            System.out.println(" In Build Function in Reverse string : " + new StringBuffer(sentence).reverse());
        }
    }

    private static String reverseString(String sentence) {
        String reverse = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverse += sentence.charAt(i);
        }
        return reverse;
    }
}