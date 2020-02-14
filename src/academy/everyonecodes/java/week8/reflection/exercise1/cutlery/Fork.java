package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

public class Fork implements Cutlery {

    @Override
    public String getName() {
        return "fork";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        if (dishName.equals("Fish") || dishName.equals("Pizza") || dishName.equals("Pasta")) {
            return true;
        } else {
            return false;
        }
    }
}
