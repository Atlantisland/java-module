package academy.everyonecodes.java.optionals.enums.exercise1;

public class Tshirt {
    private String color;
    private Size size;
    private int price;

    public Tshirt(String color, Size size, int price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

}
