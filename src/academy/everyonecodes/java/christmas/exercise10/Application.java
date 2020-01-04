package academy.everyonecodes.java.christmas.exercise10;

import static academy.everyonecodes.java.christmas.exercise10.Adult.isAdult;
import static academy.everyonecodes.java.christmas.exercise10.Hat.isWearingAHat;
import static academy.everyonecodes.java.christmas.exercise10.Password.knowsSecretPassword;

public class Application {
    public static void main(String[] args) {
        boolean isAdult = isAdult();
        boolean isWearingAHat = isWearingAHat();
        boolean knowsPassword = knowsSecretPassword();
        if (isAdult && isWearingAHat && knowsPassword) {
            System.out.println("You can enter our club");
        }
        if (!isAdult || !isWearingAHat || !knowsPassword) {
            System.out.println("I am sorry, but you cannot enter our club.");
        }

    }
}
