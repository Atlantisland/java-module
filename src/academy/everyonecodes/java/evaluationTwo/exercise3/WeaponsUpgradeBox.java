package academy.everyonecodes.java.evaluationTwo.exercise3;

public class WeaponsUpgradeBox extends MysteryBox {


    public WeaponsUpgradeBox(int intensity) {
        super(intensity);
    }

    @Override
    void apply(Spaceship spaceship) {
        spaceship.setDamage(getIntensity());
    }
}
