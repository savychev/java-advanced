package stringcomparator;

public class MainApp {
    public static void main(String[] args) {
        StringComparator startsWithSameLetter = (a, b) -> {
            String aFirstLetter = a.substring(0, 1);
            String bFirstLetter = b.substring(0, 1);

            return aFirstLetter.equals(bFirstLetter);
        };

        StringComparator equalLength = (a,b) -> a.length() == b.length();

        System.out.println(startsWithSameLetter.compare("Hello", "World"));
        System.out.println(startsWithSameLetter.compare("Hello", "House"));
        System.out.println(" ");
//        System.out.println(startsWithSameLetter.compare("Hello", "")); // StringIndexOutOfBoundsException
        System.out.println(" ");
        System.out.println(equalLength.compare("Hello", "World"));
        System.out.println(equalLength.compare("Hello", "Bye"));
    }
}


