package academy.everyonecodes.java.week9.set2.exercise1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChangeUnitsCalculator {
    private List<MoneyUnit> moneyUnits = EuroUnits.get();

    public List<MoneyUnit> calculate(double amount) {
        List<MoneyUnit> changes = new ArrayList<>();
        while (amount >= 0.01) {
            Optional<MoneyUnit> oMoneyUnit = getMoneyUnit(amount);
            if (oMoneyUnit.isPresent()) {
                MoneyUnit moneyUnit = oMoneyUnit.get();
                changes.add(moneyUnit);

                amount = BigDecimal.valueOf(amount)
                        .subtract(BigDecimal.valueOf(moneyUnit.getValue()))
                        .doubleValue();
            }
        }
        return changes;
    }

    private Optional<MoneyUnit> getMoneyUnit(double amount) {
        return moneyUnits.stream()
                .filter(moneyUnit -> moneyUnit.getValue() <= amount)
                .findFirst();
    }
}

    