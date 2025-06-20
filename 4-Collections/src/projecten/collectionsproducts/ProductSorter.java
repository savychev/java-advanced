package projecten.collectionsproducts;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {
    private List<Product> allProducts = new ArrayList<>();

    private List<FoodProduct> foodProducts = new ArrayList<>();
    private List<HealthProduct> healthProducts = new ArrayList<>();
    private List<ElectricProduct> electricProducts = new ArrayList<>();

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    // aantal van producten
    public int getTotalProductCount() {
        return allProducts.size();
    }

    // producten sorteren
    public void sortProduct(Product product) {
        // dublicate control productID
        for (Product p : allProducts) {
            if (p.getProductId() == product.getProductId()) {
                return; // Если ID уже есть — не добавляем
            }
        }

        // Добавляем в общий список
        allProducts.add(product);

        // Добавляем в соответствующий список по типу
        if (product instanceof FoodProduct) {
            foodProducts.add((FoodProduct) product);
        } else if (product instanceof HealthProduct) {
            healthProducts.add((HealthProduct) product);
        } else if (product instanceof ElectricProduct) {
            electricProducts.add((ElectricProduct) product);
        }
    }
}

