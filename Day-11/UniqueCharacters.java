import java.util.HashSet;

public class UniqueCharacters {
    public static boolean hasUniqueCharacters(String s) {
        HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return false;
            }
            seen.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "abcd";
        String input2 = "aabc";
        System.out.println(hasUniqueCharacters(input1)); // Output: true
        System.out.println(hasUniqueCharacters(input2)); // Output: false
    }
}