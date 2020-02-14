package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

public class Spoon implements Cutlery {

    @Override
    public String getName() {
        return "spoon";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        if (dishName.equals("Soup")) {
            return true;
        } else {
            return false;
        }
    }
}
