package academy.everyonecodes.java.christmas.exercise10;

public class SecurityRobot {

    public boolean checkIfAllowedToEnter() {
        AdultChecker adultChecker = new AdultChecker();
        HatChecker hatChecker = new HatChecker();
        PasswordChecker passwordChecker = new PasswordChecker();
        return adultChecker.check() && hatChecker.check() && passwordChecker.check();

    }
}
