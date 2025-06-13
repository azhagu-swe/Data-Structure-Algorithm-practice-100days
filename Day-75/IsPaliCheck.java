import java.util.stream.IntStream;

public class IsPaliCheck {
    public static void main(String[] args) {

        String str = "amma";
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev))
            System.out.println("This is palindrome");
        else
            System.out.println("This not palindrome");

        boolean isPalindrome = IntStream
                .range(0, str.length() / 2).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
        System.out.println(isPalindrome ? "palindrome" : "is not Palindrome");

    }

}
