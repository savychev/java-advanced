import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Brussel");
        list.add("Antwerpen");
        list.add("Gent");
        list.add("Dendermonde");
        list.add("Leuven");

        list.add("Antwerpen");

        list.add(3,"Leuven");

        list.forEach(city -> System.out.println(city + " "));
    }
}
