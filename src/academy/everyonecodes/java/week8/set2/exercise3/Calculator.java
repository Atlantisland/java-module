package academy.everyonecodes.java.week8.set2.exercise3;

import academy.everyonecodes.java.week8.set2.exercise3.operators.Operator;
import academy.everyonecodes.java.week8.set2.exercise3.operators.Operators;

import java.util.List;
import java.util.Optional;

public class Calculator {
    private List<Operator> operators = Operators.get();

    public Optional<Double> calculate(Calculation calculation) {
        return operators.stream()
                .filter(operator -> isEquals(calculation, operator))
                .map(operator -> getOperate(calculation, operator))
                .findFirst();

    }

    private boolean isEquals(Calculation calculation, Operator operator) {
        return operator.getSymbol().equals(calculation.getSymbol());
    }

    private double getOperate(Calculation calculation, Operator operator) {
        return operator.operate(calculation.getNumber1(), calculation.getNumber2());
    }

}
