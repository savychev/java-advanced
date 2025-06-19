import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Brussel");
        list.add("Antwerpen");
        list.add("Gent");
        list.add("Dendermonde");
        list.add("Leuven");
        list.add("Antwerpen");

        list.forEach(city -> System.out.println(city + " "));
    }
}
