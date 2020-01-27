package academy.everyonecodes.java.week4.reflection.exercise1;

public class FromZeroRounder {
    public double round(Double number) {
        if (number < 0) {
            return Math.floor(number);
        }

        return Math.ceil(number);
    }
}
