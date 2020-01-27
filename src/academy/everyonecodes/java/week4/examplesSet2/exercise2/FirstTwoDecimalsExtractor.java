package academy.everyonecodes.java.week4.examplesSet2.exercise2;

public class FirstTwoDecimalsExtractor {
    public double extract(double value) {
        double floor = Math.floor(value);
        double decimals = value - floor;
        return Math.floor(decimals * 100);
    }
}
