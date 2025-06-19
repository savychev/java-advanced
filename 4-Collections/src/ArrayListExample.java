import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Vova");
        list.add("Vogva");
        list.add("Vota");
        list.add("Vovaton");
        list.add("Fova");
        list.add("Bova");
        list.add("Ova");
        list.add("Vovavovan");

        list.forEach(city -> System.out.println(city + " "));
    }
}
