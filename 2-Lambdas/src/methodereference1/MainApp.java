package methodereference1;

public class MainApp {
    public static void main(String[] args) {
        IntTransformer triple1 = x -> MathUtils.triple(x);
        IntTransformer triple2 = MathUtils::triple;

        System.out.println(triple1.transform(1)); // 3
        System.out.println(triple2.transform(7)); // 21

    }
}
