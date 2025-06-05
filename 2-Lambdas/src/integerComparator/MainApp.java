package integerComparator;

public class MainApp {
    public static void main(String[] args) {
        IntegerComparator greater = (a, b) -> a > b;
        System.out.println(greater.compare(5, 10));
        System.out.println(greater.compare(10, 5));
        System.out.println(greater.compare(5, 5));

        System.out.println(" ");

        IntegerComparator smaller = (a, b) -> a < b;
        System.out.println(smaller.compare(5, 10));
        System.out.println(smaller.compare(10, 5));
        System.out.println(smaller.compare(5, 5));

        System.out.println(" ");

        IntegerComparator equal = (a, b) -> a == b;
        System.out.println(equal.compare(5, 10));
        System.out.println(equal.compare(10, 5));
        System.out.println(equal.compare(5, 5));
    }
}
