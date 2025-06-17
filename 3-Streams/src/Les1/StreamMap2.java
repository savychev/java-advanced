package Les1;

import java.util.ArrayList;
import java.util.List;

public class StreamMap2 {
    public static void main(String[] args) {
        List<String> myPlaces = new ArrayList<>();
        myPlaces.add("Nepal eirugher");
        myPlaces.add("Nepal fthrty");
        myPlaces.add("Nepal eryfge");
        myPlaces.add("Oekraine eirugher");
        myPlaces.add("Marocco eirugher");
        myPlaces.add("Belgie eirugher");
        myPlaces.add("USA eirugher");

        System.out.println("From Nepal: ");

        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .forEach((p) -> System.out.println(p));
    }
}
