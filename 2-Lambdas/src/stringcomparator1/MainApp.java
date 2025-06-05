package stringcomparator1;

public class MainApp {
    public static void main(String[] args) {
        StringComparator startsWithSameLetter = (a, b) -> {
            if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
                return false;
            }
            return a.charAt(0) == b.charAt(0);
        };

        StringComparator equalLength = (a, b) -> {
            if (a == null || b == null) {
                return false;
            }
            return a.length() == b.length();
        };

        System.out.println(startsWithSameLetter.compare("Hello", "World"));
        System.out.println(startsWithSameLetter.compare("Hello", "House"));
        System.out.println(" ");
        System.out.println(startsWithSameLetter.compare("Hello", ""));
        System.out.println(" ");
        System.out.println(equalLength.compare("Hello", "World"));
        System.out.println(equalLength.compare("Hello", "Bye"));
    }
}


