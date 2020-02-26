package academy.everyonecodes.java.week9.reflection.exercise1;

public class ElectricCar extends Car {

    protected ElectricCar(String brand) {
        super(brand);
    }

    @Override
    String refuel() {
        return "I am recharging my electric car";
    }

}
