package academy.everyonecodes.java.week9.set1.exercise3;

public class MoneyUnit {
    private double value;
    private String currency;

    public MoneyUnit(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }
}
