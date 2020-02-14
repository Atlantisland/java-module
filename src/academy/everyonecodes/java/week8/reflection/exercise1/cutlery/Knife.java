package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

public class Knife implements Cutlery {

    @Override
    public String getName() {
        return "knife";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        if (dishName.equals("Fish") || dishName.equals("Pizza")) {
            return true;
        } else {
            return false;
        }
    }
}
