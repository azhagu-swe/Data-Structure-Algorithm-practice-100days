import java.util.stream.Collectors;

public class SRev {
    public static void main(String[] args) {
        String str = "hello";

        String rev = str.chars().mapToObj(c -> (char) c).sorted((a, b) -> -1).map(String::valueOf).collect(Collectors.joining()).toString();

        System.out.println(rev);

    }

}
