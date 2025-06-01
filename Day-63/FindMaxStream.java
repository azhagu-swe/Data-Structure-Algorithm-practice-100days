import java.util.Optional;
import java.util.stream.IntStream;

public class FindMaxStream {
    public static void main(String[] args) {
        Optional<Integer> max = IntStream.of(1, 2, 3, 4, 5, 6, 7).boxed().max(Integer::compareTo);
        Optional<Integer> min = IntStream.of(1, 2, 3, 4, 5, 6, 7).boxed().min(Integer::compareTo);

        max.ifPresent(value -> System.out.println(value));
        min.ifPresent(value -> System.out.println(value));
    }

}
