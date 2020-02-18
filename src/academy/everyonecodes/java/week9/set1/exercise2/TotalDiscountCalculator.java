package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class TotalDiscountCalculator {

    private List<Discount> discounts = Discounts.get();

    public double calculate(List<Product> products) {
        return calculateTotal(products) - calculateTotalDiscount(products);
    }

    private double calculateTotalDiscount(List<Product> products) {
        return discounts.stream()
                .map(discount -> discount.apply(products))
                .reduce(0.0, Double::sum);
    }

    private double calculateTotal(List<Product> products) {
        return products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
    }
}

