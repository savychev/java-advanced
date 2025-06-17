package Les1;

import java.util.ArrayList;
import java.util.List;

public class StringFilter1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lai");
        names.add("Manesh");
        names.add("Ajay");
        names.add("Hemant");
        names.add("Vishal");

        long count = names.stream().filter(str->str.length()<5).count();
        System.out.println(count+" strings zith length less than 5");

    }
}
