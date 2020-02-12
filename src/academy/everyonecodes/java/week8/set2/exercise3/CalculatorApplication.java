package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.Optional;
import java.util.Scanner;

public class CalculatorApplication {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Enter the operation: ");
        Scanner scanner = new Scanner(System.in);
        Double number1 = scanner.nextDouble();
        scanner.nextLine();
        String symbol = scanner.nextLine();
        Double number2 = scanner.nextDouble();
        scanner.nextLine();

        Calculation calculation = new Calculation(symbol, number1, number2);

        Optional<Double> result = calculator.calculate(calculation);
        if (result.isEmpty()) {
            System.out.println("Solution: operation not available");
        } else {
            System.out.println("Solution: " + result.get());
        }
    }
}



