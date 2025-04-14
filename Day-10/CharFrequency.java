import java.util.HashMap;

public class CharFrequency {
    public static HashMap<Character, Integer> charFrequency(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(charFrequency(input)); // Output: {z=1, o=2, h=1}
    }
}
