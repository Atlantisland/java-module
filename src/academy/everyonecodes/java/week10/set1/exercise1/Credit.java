package academy.everyonecodes.java.week10.set1.exercise1;

import academy.everyonecodes.java.week10.set1.exercise1.providers.AmericanExpressProvider;
import academy.everyonecodes.java.week10.set1.exercise1.providers.MasterCardProvider;
import academy.everyonecodes.java.week10.set1.exercise1.providers.Provider;
import academy.everyonecodes.java.week10.set1.exercise1.providers.VisaProvider;

import java.util.List;
import java.util.Optional;


public class Credit {

    private List<Provider> providers = List.of(
            new AmericanExpressProvider(),
            new MasterCardProvider(),
            new VisaProvider());

    public String evaluate(long creditCardNumber) {
        String ccNumber = String.valueOf(creditCardNumber);
        if (isValid(ccNumber)) {
            Optional<String> match = providers.stream()
                    .filter(provider -> provider.provides(creditCardNumber))
                    .map(Provider::getName)
                    .findFirst();
            if (match.isPresent()) {
                return match.get();
            }
        }
        return "Invalid";
    }

    private boolean isValid(String ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
