package labwerk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(100); // 0–99
            numbers.add(randomNumber);
        }

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Random getallen (groot naar klein): " + numbers);
    }
}
