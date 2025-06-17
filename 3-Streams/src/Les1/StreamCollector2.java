package Les1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector2 {
    public static void main(String[] args) {
        Map<String, Long> groupedCount = Stream.of("apple", "banana", "avocado")
                .collect(Collectors.groupingBy(
                        s -> s.substring(0, 1),         // группировка по первой букве
                        Collectors.counting()          // количество в каждой группе
                ));

        System.out.println(groupedCount); // {a=2, b=1}
    }
}
