package stringComparator;

public class MainApp {
    StringComparator startsWithSameLetter = (a, b) -> {
        String aFirstLetter = a.substring(0, 1);
        String bFirstLetter = b.substring(0, 1);

        return true;
    }
}
