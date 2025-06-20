package labwerken.arraylist;

import java.util.ArrayList;

public class Oefening1 {
    public static void main(String[] args) {
        ArrayList<String> wordSet = new ArrayList<>();
        wordSet.add("appel");
        wordSet.add("banaan");
        wordSet.add("kers");

        ArrayList<String> extraWords = new ArrayList<>();
        extraWords.add("druif");
        extraWords.add("meloen");
        extraWords.add("peer");

        ArrayList<String> allWords = new ArrayList<>();
        allWords.addAll(wordSet);
        allWords.addAll(extraWords);

        System.out.println("Alle woorden: " + allWords);
    }
}

