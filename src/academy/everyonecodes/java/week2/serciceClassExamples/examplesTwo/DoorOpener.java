package academy.everyonecodes.java.week2.serciceClassExamples.examplesTwo;

public class DoorOpener {

    public void open(Door door, Key key) {
        if(door.getKeyphrase().equals(key.getKeyphrase())) {
            System.out.println("I am opening door " + door.getDoorNumber() + " using" + key.getHolderName() + "'s key.");
        } else {
            System.out.println("This is the wrong key!");
        }
    }
}
