package academy.everyonecodes.java.week2.serciceClassExamples.Exercise1;

import academy.everyonecodes.java.week2.serciceClassExamples.Exercise1.Door;
import academy.everyonecodes.java.week2.serciceClassExamples.Exercise1.DoorOpener;
import academy.everyonecodes.java.week2.serciceClassExamples.Exercise1.Key;

public class ApplicationTwo {
    public static void main(String[] args) {
        Door mikesDoor = new Door(5, "sup3rs4fe");
        Key mikesKey = new Key("Mike", "sup3rs4fe");
        Key henrysKey = new Key("Henry", "1234");

        DoorOpener opener = new DoorOpener();

        opener.open(mikesDoor, henrysKey);
        opener.open(mikesDoor, mikesKey);
    }
}
