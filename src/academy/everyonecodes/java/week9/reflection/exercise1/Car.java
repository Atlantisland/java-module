package academy.everyonecodes.java.week9.reflection.exercise1;

public abstract class Car {

    private String brand;

    protected Car(String brand) {
        this.brand = brand;
    }

    public String describe() {
        return "I am a " + brand + " car!";
    }

    abstract String refuel();
}


