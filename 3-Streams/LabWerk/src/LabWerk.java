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

}
