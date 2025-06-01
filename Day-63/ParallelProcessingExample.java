import java.util.stream.IntStream;

public class ParallelProcessingExample {
    public static void main(String[] args) {
        IntStream.range(1, 10).parallel().forEach(System.out::println);

    }
}