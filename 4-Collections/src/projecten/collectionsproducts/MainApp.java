package projecten.collectionsproducts;

public class MainApp {
    public static void main(String[] args) {
        ProductSorter sorter = new ProductSorter(); // Создаём сортировщик
        ProductFactory factory = new ProductFactory(sorter); // Передаём его в фабрику

        factory.createProducts(100); // Генерируем 100 продуктов

        // Печатаем общее количество продуктов
        System.out.println("Totaal aantal unieke producten: " + sorter.getTotalProductCount());

        // Печатаем списки
        System.out.println("\n--- Food Products ---");
        for (FoodProduct p : sorter.getFoodProducts()) {
            System.out.println(p);
        }

        System.out.println("\n--- Health Products ---");
        for (HealthProduct p : sorter.getHealthProducts()) {
            System.out.println(p);
        }

        System.out.println("\n--- Electric Products ---");
        for (ElectricProduct p : sorter.getElectricProducts()) {
            System.out.println(p);
        }
    }
}

