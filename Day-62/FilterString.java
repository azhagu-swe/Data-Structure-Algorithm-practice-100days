import java.util.List;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

public class FilterString {
    public static void main(String[] args) {
        List<String> names = List.of("mani", "kandan", "Alagu", "azhagu", "dheeran");
        List<String> filterNames = names.stream().filter(name -> name.length() > 4).toList();

        // List<String> filterNames1 = names.stream().filter(name -> name.length() > 4).collect(Collectors.toList());

        System.out.println(filterNames);
    }

}
