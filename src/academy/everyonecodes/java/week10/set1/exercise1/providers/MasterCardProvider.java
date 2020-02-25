package academy.everyonecodes.java.week10.set1.exercise1.providers;

import java.util.List;

public class MasterCardProvider extends Provider {

    private List<String> digitStartWith = List.of("22", "51", "52", "53", "54", "55");

    public MasterCardProvider() {
        super("Master Card");
    }

    @Override
    public boolean provides(long creditCardNumber) {
        String digit = String.valueOf(creditCardNumber);
        int length = digit.length();
        String MCStartWith = digit.substring(0, 2);
        return length == 16 && digitStartWith.contains(MCStartWith);
    }
}
