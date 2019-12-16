package academy.everyonecodes.java.week2.set1.exercise1;

public class Student {

    private String name;
    private String peerProgrammerName;

    public Student(String name, String peerProgrammerName) {
        this.name = name;
        this.peerProgrammerName = peerProgrammerName;
    }

    public String getName() {
        return name;
    }

    public String getPeerProgrammerName() {
        return peerProgrammerName;
    }

    public void setPeerProgrammerName(String peerProgrammerName) {
        this.peerProgrammerName = peerProgrammerName;
    }
}
