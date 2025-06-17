import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LabWerk {
    // De methode die een lijst van Strings als parameter verwacht en een lijst van Strings teruggeeft
    // waarbij alle Strings in hoofdletters zijn.
    public List<String> toUppercase(List<String> strings) {
        return strings.stream()                 // List naar Stream omzetten
                .map(String::toUpperCase)       // elke string naar hoofdletter
                .collect(Collectors.toList());  // terug naar List verzamelen
    }

    //    Schrijf een methode die een lijst van Strings als parameter verwacht en een lijst van Strings teruggeeft
    //    waarbij alle Strings die beginnen met een ‘a’ zijn.
    public List<String> filterA(List<String> strings) {
        return strings.stream()                            // List naar Stream omzetten
                .filter(s -> s.startsWith("a"))      // alleen de strings die beginnen met 'a' filteren
                .collect(Collectors.toList());              // terug naar List verzamelen
    }

    //    Schrijf een methode die een lijst van Strings als parameter verwacht en een lijst van Strings teruggeeft waarbij alle
    //    Strings beginnen met een ‘a’ en de lengte van de String groter is dan 3.
    public List<String> filterB(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)   // de strings die beginnen met 'a' en langer zijn dan 3 tekens filteren
                .collect(Collectors.toList());                            // terug naar List verzamelen
    }

    //    Schrijf een methode die een lijst van Strings als parameter verwacht en een lijst van Strings teruggeeft waarbij alle
    //    Strings beginnen met een ‘a’ en de lengte van de String groter is dan 3. De Strings moeten ook in
    //    omgekeerde volgorde zijn.
    public List<String> filterC(List<String> strings) {
        List<String> result = strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3) // filteren op beginletter en lengte
                .collect(Collectors.toList());                          // resultaat verzamelen in een tijdelijke lijst

        Collections.reverse(result); // lijst omkeren naar omgekeerde volgorde

        return result;
    }

    //    Schrijf een methode die een lijst van Strings als parameter verwacht en een lijst van Strings teruggeeft waarbij
    //    alle Strings die beginnen met een ‘a’ zijn en de lengte van de String groter is dan 3. De Strings moeten
    //    ook in omgekeerde volgorde zijn en de Strings moeten worden samengevoegd tot een String met een komma als
    //    scheidingsteken.
    public String filterD(List<String> strings) {
        List<String> filtered = strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3) // filteren op beginletter en lengte
                .collect(Collectors.toList());                          // gefilterde strings verzamelen

        Collections.reverse(filtered);                                  // lijst omkeren

        return String.join(",", filtered);                      // elementen samenvoegen met komma
    }

    //    Schrijf een methode die een lijst van Strings als parameter verwacht en een lijst van Strings teruggeeft waarbij
    //    alle Strings beginnen met een ‘a’ en de lengte van de String groter is dan 3. De Strings moeten
    //    ook in omgekeerde volgorde zijn en de Strings moeten worden samengevoegd tot een String met een komma als
    //    scheidingsteken. De String moet ook in hoofdletters zijn.
    public String filterE(List<String> strings) {
        List<String> filtered = strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3) // filteren op beginletter en lengte
                .collect(Collectors.toList());                          // gefilterde strings verzamelen

        Collections.reverse(filtered);                                  // lijst omkeren

        String joined = String.join(",", filtered);             // elementen samenvoegen met komma

        return joined.toUpperCase();                                    // alles omzetten naar hoofdletters
    }


    //    Schrijf een programma om het gemiddelde van alle even getallen in een lijst te vinden met behulp van streams.
    public static double averageOfEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)                        // alleen even getallen filteren
                .mapToInt(Integer::intValue)                            // omzetten naar een IntStream
                .average()                                              // gemiddelde berekenen
                .orElse(0.0);                                      // als de lijst leeg is — 0 teruggeven
    }

    //    Schrijf een programma om de lengte van de langste string in een lijst te vinden met behulp van streams.
    public static int lengthOfLongestString(List<String> strings) {
        return strings.stream()
                .mapToInt(String::length)                               // elke string omzetten naar zijn lengte
                .max()                                                  // maximumwaarde bepalen
                .orElse(0);                                        // als de lijst leeg is — 0 teruggeven
    }

    //    Schrijf een programma om te controleren of een lijst alleen even bevat
    public static boolean allEven(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> n % 2 == 0);                         // true als alle getallen even zijn

    }

    //    Schrijf een programma om het product van alle elementen in een lijst te vinden met behulp van streams.
    public static int productOfAll(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);          // alle getallen reduceren tot één vermenigvuldiging
    }

    //    Schrijf een programma om alle dubbele elementen uit een lijst te verwijderen met behulp van streams.
    public static List<String> removeDuplicates(List<String> strings) {
        return strings.stream()
                .distinct()                           // dubbele waarden verwijderen
                .collect(Collectors.toList());        // verzamelen in een lijst
    }

}
