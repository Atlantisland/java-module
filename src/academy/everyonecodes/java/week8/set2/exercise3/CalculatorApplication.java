package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CalculatorApplication {


    public static void main(String[] args) {
        Calculation calculation = getCalculation();
        Calculator calculator = new Calculator();
        Optional<Double> oResult = calculator.calculate(calculation);
        if (oResult.isPresent()) {
            System.out.println("Solution: " + oResult.get());
        } else {
            System.out.println("Solution: operation not available");
        }
    }

    private static Calculation getCalculation() {
        System.out.println("Enter the operation:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<String> parts = List.of(line.split(" "));
        return new Calculation(
                parts.get(1),
                Double.valueOf(parts.get(0)),
                Double.valueOf(parts.get(2))
        );
    }

}



