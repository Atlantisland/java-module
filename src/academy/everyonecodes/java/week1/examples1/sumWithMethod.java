package academy.everyonecodes.java.week1.examples1;

  public class sumWithMethod {
    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static void main(String[] args) {
        int numberOne = 7;
        int numberTwo = 16;
        int sum =sum(numberOne, numberTwo);
        System.out.println("The result is" + sum);
    }
}
