import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Brussel");
        v.add("Antwerpen");
        v.add("Gent");
        v.add("Dendermonde");
        v.add("Leuven");

        v.forEach(city -> System.out.println(city + " "));
    }
}
