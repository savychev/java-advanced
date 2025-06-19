import java.util.HashSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Een HashSet maken en elementen toevoegen
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, wordt genegeerd
        System.out.println("HashSet: " + set); // [Apple, Orange, Banana]

        // Controleren of een element in de HashSet zit
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? " + containsApple); // true// Een element uit de HashSet verwijderen
        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange? " + removed); // true

        // De grootte van de HashSet opvragen
        int size = set.size();
        System.out.println("Size of HashSet: " + size); // 2

        // De HashSet leegmaken
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty); // true
    }
}

