import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        String sentence = "hello world!";

        Map<Character, Long> letterCount = sentence.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(letterCount);
    }

}
