import java.util.Map;
import java.util.stream.Collectors;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String sentence = "hello world!";

        Map<String, Long> count = sentence.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
                .collect(Collectors.groupingBy(c -> "aeiouAEIOU".indexOf(c) >= 0 ? "Vowels" : "Consonants",
                        Collectors.counting()));
                        System.out.println(count);
    }
}