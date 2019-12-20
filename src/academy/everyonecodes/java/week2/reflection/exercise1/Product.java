package academy.everyonecodes.java.week2.reflection.exercise1;

public class Product {

    private String productsName;
    private double price;

    public Product(String productsName, double price) {
        this.productsName = productsName;
        this.price = price;
    }

    public String getProductsName() {
        return productsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
