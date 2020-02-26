package academy.everyonecodes.java.week9.set2.exercise1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChangeUnitsCalculator {
    private List<MoneyUnit> units = EuroUnits.get();

    public List<MoneyUnit> calculate(double amount) {
        List<MoneyUnit> change = new ArrayList<>();
        while (amount > 0) {
            MoneyUnit unit = findBiggestUnit(amount);
            amount = subtract(amount, unit);
            change.add(unit);
        }
        return change;
    }

    private double subtract(double amount, MoneyUnit unit) {
        return BigDecimal.valueOf(amount).subtract(BigDecimal.valueOf(unit.getValue())).doubleValue();
    }

    private MoneyUnit findBiggestUnit(double amount) {
        return units.stream()
                .sorted(Comparator.comparing(MoneyUnit::getValue).reversed())
                .filter(unit -> unit.getValue() <= amount)
                .findFirst().orElseThrow();
    }

}

    