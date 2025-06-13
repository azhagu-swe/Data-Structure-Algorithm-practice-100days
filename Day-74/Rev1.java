import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Rev1 {

    public static void main(String[] args) {

        String str = "hello";

        Map<String, Long> countMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(countMap);
        Map<Character, Long> countMap1 = str.chars().mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(countMap1);
    }
}