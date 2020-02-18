package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class Discount {

    private int percentage;
    private List<String> applicableProducts;

    public Discount(int percentage, List<String> applicableProducts) {
        this.percentage = percentage;
        this.applicableProducts = applicableProducts;
    }

    public int getPercentage() {
        return percentage;
    }

    public List<String> getApplicableProducts() {
        return applicableProducts;
    }

    public double apply(List<Product> products) {
        return products.stream()
                .filter(product -> applicableProducts.contains(product.getName()))
                .map(price -> price.getPrice() * (percentage / 100.0))
                .reduce(0.0, Double::sum);
    }
}
