package academy.everyonecodes.java.week10.set1.exercise1.providers;

import java.util.List;

public class AmericanExpressProvider extends Provider {

    private List<String> digitStartWith = List.of("34", "37");

    public AmericanExpressProvider() {
        super("American Express");
    }

    @Override
    public boolean provides(long creditCardNumber) {
        String digit = String.valueOf(creditCardNumber);
        int length = digit.length();
        String AEStartWith = digit.substring(0, 2);
        return length == 15 && digitStartWith.contains(AEStartWith);
    }
}
