package academy.everyonecodes.java.evaluationTwo.exercise3;

public class SparePartsBox extends MysteryBox {


    public SparePartsBox(int intensity) {
        super(intensity);
    }

    @Override
    void apply(Spaceship spaceship) {
        spaceship.setHealth(getIntensity());
    }
}
