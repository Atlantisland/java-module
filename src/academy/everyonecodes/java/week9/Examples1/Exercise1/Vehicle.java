package academy.everyonecodes.java.week9.Examples1.Exercise1;

public class Vehicle {
    private String brand;
    private String type;
    private int numberOfWheels;

    public Vehicle(String brand, String type, int numberOfWheels) {
        this.brand = brand;
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
