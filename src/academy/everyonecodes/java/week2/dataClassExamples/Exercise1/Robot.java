package academy.everyonecodes.java.week2.dataClassExamples.Exercise1;

public class Robot {

    private String name;
    private int money;

    public void setMoney(int money) {
        this.money = money;
    }

    public Robot(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }


}
