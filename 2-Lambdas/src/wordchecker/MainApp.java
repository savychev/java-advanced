package wordchecker;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("WordChecker");
        WordChecker startWithA = word -> word.startsWith("A");
        System.out.println(startWithA.check("Apple"));
        System.out.println(startWithA.check("Banana"));
        System.out.println(startWithA.check(""));
        System.out.println(startWithA.check("123"));

        System.out.println(" ");

        WordChecker startWith1 = word -> word.startsWith("1");
        System.out.println(startWith1.check("123"));
        System.out.println(startWith1.check("321"));

    }
}
