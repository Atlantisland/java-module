package academy.everyonecodes.java.week9.Examples2;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String introduce() {
        return "Hello, my name is " + name;
    }

    public abstract String describeWork();
}
