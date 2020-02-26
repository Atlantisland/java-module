package academy.everyonecodes.java.evaluation2.optionals.Enums;

public class Dish {

    private String name;
    private DishCategory dishCategory;
    private double price;

    public Dish(String name, DishCategory dishCategory, double price) {
        this.name = name;
        this.dishCategory = dishCategory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public DishCategory getDishCategory() {
        return dishCategory;
    }

    public double getPrice() {
        return price;
    }
}
