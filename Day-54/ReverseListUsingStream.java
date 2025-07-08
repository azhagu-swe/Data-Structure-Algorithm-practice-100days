import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseListUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Original List  :"+numbers);

       numbers=numbers.stream().collect(Collectors.toCollection(LinkedList::new));
        Collections.reverse(numbers);
        System.out.println(numbers);
    }

}
