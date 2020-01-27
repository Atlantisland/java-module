package academy.everyonecodes.java.week3.examples2.exercise2;

public class SpecialLeprechaunGoldPot {

    public int countGoldPieces(int age, boolean hasNeverHarmed) {
        if (age == 100 && hasNeverHarmed) {
            return 1000;
        }
        return 0;
    }
}
