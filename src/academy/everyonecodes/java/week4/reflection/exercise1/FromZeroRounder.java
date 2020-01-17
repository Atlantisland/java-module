package academy.everyonecodes.java.week4.reflection.exercise1;

public class FromZeroRounder {
    public double round(Double number) {
        if (number == 0.0) {
            return 0.0;
        }
        if (number > 0.0) {
            return Math.ceil(number);
        }
        return Math.floor(number);
    }
}
