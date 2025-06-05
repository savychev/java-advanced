package methodreference;

public class MainApp {
    public static void main(String[] args) {
        StringTransformer upper1 = s -> s.toUpperCase();
        StringTransformer upper2 = String::toUpperCase;

        System.out.println(upper1.transform("dimi"));
        System.out.println(upper2.transform("sfeer"));
    }
}
