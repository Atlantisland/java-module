package academy.everyonecodes.java.week2.examples;

public class Application {
    public static void main(String[] args) {
        Robot derek = new Robot("Derek", 5);
        Robot hansel = new Robot("Hansel", 7);

        int derekCurrentMoney = derek.getMoney();
        derek.setMoney(derekCurrentMoney + 2);

        int hanselCurrentMoney = hansel.getMoney();
        hansel.setMoney(hanselCurrentMoney + 2);

        int totalAmount = derek.getMoney() + hansel.getMoney();

        System.out.println("Together they have" + totalAmount + "Euro.");
    }
}
