// Write a Java program to reverse a given string without using any built-in functions or libraries.

// Here’s a Java program to reverse a string:

public class ReverseStringTest {
    public static void main(String[] args) {
        String word = "Hello World!";
        int start = 0, end = word.length() - 1;
        char[] reverse = word.toCharArray();
        while (start < end) {
            char temp = reverse[start];
            reverse[start] = reverse[end];
            reverse[end] = temp;
            start++;
            end--;

        }
        System.out.println(reverse);

        String reversedString = new StringBuffer(word).reverse().toString();
        System.out.println(reversedString);
        String rev = new StringBuilder(word).reverse().toString();
        System.out.println(rev);

    }

}
