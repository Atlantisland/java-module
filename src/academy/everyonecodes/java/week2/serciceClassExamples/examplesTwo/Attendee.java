package academy.everyonecodes.java.week2.serciceClassExamples.examplesTwo;

public class Attendee {
    private String attendeeName;
    private int age;

    public Attendee(String attendeeName, int age) {
        this.attendeeName = attendeeName;
        this.age = age;

    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public int getAge() {
        return age;
    }
}

