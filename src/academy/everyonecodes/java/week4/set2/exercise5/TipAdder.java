package academy.everyonecodes.java.week4.set2.exercise5;

public class TipAdder {
    public double add(double amount) {
        amount = 0.05 * amount + amount;
        double floor = Math.floor(amount);
        double decimals = amount - floor;
        if (decimals < 0.50) {
            double roundTo = 0.50;
            return roundTo * Math.round(amount / roundTo);
        } else {
            double ceil = Math.ceil(amount);
            double roundTo = ceil - amount;
            double lastCeil = Math.ceil(roundTo * Math.round(amount / roundTo));
            return lastCeil;

        }
    }
}
