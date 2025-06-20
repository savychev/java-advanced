package projecten.collectionsproducts;

import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter;

    private final String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private final String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private final String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    Random random = new Random(); // obj van Random aanmaken
    Product product = null; // initialisatie

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    // maakt willekeurige producten aan en stuurt ze naar de ProductSorter
    public void createProducts(int amount) {


        for (int i = 0; i < amount; i++) {
            int category = random.nextInt(3); // een category wisselvallig kiezen (0-2)
            int id = random.nextInt(151); // ID tussen 0 en 150

            switch (category) {
                case 0: // als food
                    String foodName = foodProducts[random.nextInt(foodProducts.length)]; // random product van food-category kiezen
                    product = new FoodProduct(foodName, id); // obj van FoodProduct aan 'product' toewijzen
                    break;
                case 1:
                    String healthName = healthProducts[random.nextInt(healthProducts.length)]; // random product van health-category kiezen
                    product = new HealthProduct(healthName, id); // obj van HeathProduct aan 'product' toewijzen
                    break;
                case 2:
                    String electricName = electricProducts[random.nextInt(electricProducts.length)]; // random product van electic-category kiezen
                    product = new ElectricProduct(electricName, id); // obj van ElectricProduct aan 'product' toewijzen
            }

            if (product != null) {
                productSorter.sortProduct(product); // roep een methode 'sortProduct' met obj 'product' als parameter
            }
        }
    }
}
