package academy.everyonecodes.java.week9.reflection.exercise1;

public class DieselCar extends Car {

    protected DieselCar(String brand) {
        super(brand);
    }

    @Override
    String refuel() {
        return "I am refilling my diesel tank!";
    }

}
