package academy.everyonecodes.java.week9.Examples1.Exercise1;

public class Motorbike extends Vehicle {

    private String seatType;

    public Motorbike(String brand, int numberOfWheels, String seatType) {
        super(brand, "motorbike", numberOfWheels);
        this.seatType = seatType;
    }

    public String getSeatType() {
        return seatType;
    }
}
