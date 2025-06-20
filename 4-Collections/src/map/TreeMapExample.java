package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // Een TreeMap maken en elementen toevoegen
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 8);

        // Een element opzoeken en de waarde afdrukken
        int quantityOfApple = treeMap.get("Apple");
        System.out.println("Aantal appels: " + quantityOfApple);

        // Controleren of een sleutel aanwezig is in de TreeMap
        boolean containsBanana = treeMap.containsKey("Banana");
        System.out.println("Bevat banaan? " + containsBanana);
        int size = treeMap.size();
        System.out.println("Grootte van de TreeMap: " + size);

        System.out.println();

        // Alle sleutels van de TreeMap afdrukken
        for (String key : treeMap.keySet()) {
            System.out.println("Sleutel: " + key);
        }

        System.out.println();

        // Alle waarden van de TreeMap afdrukken
        for (int value : treeMap.values()) {
            System.out.println("Waarde: " + value);
        }

        System.out.println();

        // De TreeMap leegmaken
        treeMap.clear();
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is de TreeMap leeg? " + isEmpty);
    }
}