package academy.everyonecodes.java.week9.Examples1.Exercise1;

public class Car extends Vehicle {

    private boolean isFamilyOriented;

    public Car(String brand, int numberOfWheels, boolean isFamilyOriented) {
        super(brand, "car", numberOfWheels);
        this.isFamilyOriented = isFamilyOriented;
    }

    public boolean isFamilyOriented() {
        return isFamilyOriented;
    }
}
