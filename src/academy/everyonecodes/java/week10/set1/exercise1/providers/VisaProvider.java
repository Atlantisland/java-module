package academy.everyonecodes.java.week10.set1.exercise1.providers;

import java.util.List;

public class VisaProvider extends Provider {

    private List<String> digitStartWith = List.of("4");

    public VisaProvider() {
        super("Visa");
    }

    @Override
    public boolean provides(long creditCardNumber) {
        String digit = String.valueOf(creditCardNumber);
        int length = digit.length();
        String VisaStartWith = digit.substring(0, 1);
        return length == 13 && digitStartWith.contains(VisaStartWith);
    }
}
