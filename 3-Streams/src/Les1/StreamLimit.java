package Les1;

import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        Stream.of("Vika","Dima","Olya","Misha")
                .limit(3)
                .forEach(System.out::println);
    }
}
