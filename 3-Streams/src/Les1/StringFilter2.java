package Les1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringFilter2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");

        Stream<String> stream = list.stream().filter(element -> element.contains("d"));
        stream.forEach(System.out::println);

    }
}
