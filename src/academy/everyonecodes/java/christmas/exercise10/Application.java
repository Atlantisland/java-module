package academy.everyonecodes.java.christmas.exercise10;


public class Application {
    public static void main(String[] args) {
        SecurityRobot securityRobot = new SecurityRobot();
        boolean canEnter = securityRobot.checkIfAllowedToEnter();
        if (canEnter) {
            System.out.println("You can enter our club");
        } else {
            System.out.println("I am sorry, but you cannot enter our club.");
        }

    }

}
