package Les1;

import java.util.ArrayList;

public class StreamForEach1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add(0, "Joi0");
        names.add(1, "Joi1");
        names.add(2, "Joi2");


        names.forEach(System.out::println);
    }
}
