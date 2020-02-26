package academy.everyonecodes.java.week9.Examples1.Exercise1;

public class Truck extends Vehicle {

    private int loadCapacity;

    public Truck(String brand, int numberOfWheels, int loadCapacity) {
        super(brand, "truck", numberOfWheels);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
