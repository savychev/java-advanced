package stringinspector;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("StringInspector");
        StringInspector inspector = input -> {
            System.out.println(input.toUpperCase());
            System.out.println(input.length());
            return input.length() > 5;
        };

        System.out.println(inspector.inspect("Dimi"));
        System.out.println(" ");
        System.out.println(inspector.inspect("Dimitri"));

    }
}
