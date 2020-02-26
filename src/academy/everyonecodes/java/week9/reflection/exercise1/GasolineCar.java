package academy.everyonecodes.java.week9.reflection.exercise1;

public class GasolineCar extends Car {
    protected GasolineCar(String brand) {
        super(brand);
    }

    @Override
    public String refuel() {
        return "I am refilling my gasoline tank!";
    }

}
