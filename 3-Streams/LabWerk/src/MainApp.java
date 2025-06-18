import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        LabWerk lab = new LabWerk();

        List<String> words = Arrays.asList("apple", "banana", "al", "apricot", "avocado", "berry");
        System.out.println("toUppercase: " + lab.toUppercase(words));
        System.out.println("filterA: " + lab.filterA(words));
        System.out.println("filterB: " + lab.filterB(words));
        System.out.println("filterC: " + lab.filterC(words));
        System.out.println("filterD: " + lab.filterD(words));
        System.out.println("filterE: " + lab.filterE(words));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("averageOfEven: " + LabWerk.averageOfEven(numbers));
        System.out.println("lengthOfLongestString: " + LabWerk.lengthOfLongestString(words));
        System.out.println("allEven: " + LabWerk.allEven(Arrays.asList(2, 4, 6)));
        System.out.println("productOfAll: " + LabWerk.productOfAll(numbers));
        System.out.println("removeDuplicates: " + LabWerk.removeDuplicates(Arrays.asList("apple", "banana", "apple", "cherry")));
    }
}
