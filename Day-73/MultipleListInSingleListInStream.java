
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultipleListInSingleListInStream {
        public static void main(String[] args) {
                List<List<String>> list = List.of(List.of("hello", "world"), List.of("mani", "kandan"),
                                List.of("azhagu", "The"), List.of("alagu", "alagu379", "mani", "alagu379"));
                System.out.println(list.stream().flatMap(l -> l.stream()).toList());
                List<String> singleList = list.stream().flatMap(ls -> ls.stream()).distinct()
                                .collect(Collectors.toList());

                System.out.println(singleList);
                singleList = singleList.stream().filter(s -> s.endsWith("u")).collect(Collectors.toList());
                System.out.println(singleList);

                Map<String, Long> map = list.stream().flatMap(ls -> ls.stream())
                                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
                System.out.println(map);

                // second highest value in the array
                List<Integer> n = List.of(1, 3, 45, 56, 78, 8, 8, 8, 9);
                Optional<Integer> max2 = n.stream().distinct()
                                .sorted((x, y) -> y - x)
                                .skip(1).findFirst();
                System.out.println(max2.get());

                String str = "Hello world";

                String reveString = Stream.of(str.split("")).collect(Collectors.toList()).stream().sorted((a, b) -> -1)
                                .collect(Collectors.joining());

                System.out.println(reveString);
                String rev = IntStream.range(0, str.length()).mapToObj(i -> str.charAt(str.length() - i - 1))
                                .map(String::valueOf).collect(Collectors.joining());
                System.out.println(rev);

        }

}
