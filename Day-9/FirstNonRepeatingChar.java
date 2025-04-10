import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
    public static Character firstNonRepeatingChar(String s) {
        LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : freq.keySet()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "zoho";
        System.out.println(firstNonRepeatingChar(input)); // Output: 'z'
    }
}
