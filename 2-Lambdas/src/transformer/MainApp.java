package transformer;

public class MainApp {
    public static void main(String[] args) {
        Transformer<String> uppercase = value -> value.toUpperCase();

        Transformer<Integer> square = value -> value * value;

        System.out.println(uppercase.transform("dimi"));
        System.out.println(square.transform(250));
    }
}
