import java.util.Arrays;
import java.util.stream.IntStream;

public class FilterEven {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .filter(n -> n % 2 == 0).toArray();
        // .forEach(System.out::println);
        System.out.println(Arrays.toString(IntStream.range(1, 10)
                .filter(n -> n % 2 == 0).toArray()));
    }
}
