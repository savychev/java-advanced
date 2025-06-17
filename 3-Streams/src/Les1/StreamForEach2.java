package Les1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamForEach2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Juny");
        list.add("Marin");
        list.add("Vitalik");
        list.add("Jo");
        list.add("Bram");
        list.add("Hilal");
        list.add("Maxim");

//        list.forEach(
//                (name) -> System.out.println(name)
//        );

        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
    }
}
