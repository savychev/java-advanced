package methodreference2;

public class MainApp {
    public static void main(String[] args) {
        PersonCreator creator1 = () -> new Person();
        PersonCreator creator2 = Person::new;

        Person p1 = creator1.create();
        Person p2 = creator2.create();

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
