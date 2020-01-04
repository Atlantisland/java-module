package academy.everyonecodes.java.christmas.exercise1;

//Real Life Problem: Figure out Mugatu's weight after 3 months, while his present weight is 100 Kg and he looses 0.5 Kg per week.
public class Exercise1 {

    public static void main(String[] args) {
        double numberOfLostKgPerWeek = 0.5;
        double presentWeight = 100;
        int numberOfWeeksIn3Months = 4 * 3;
        double numberOfLostKgIn3Months = numberOfLostKgPerWeek * numberOfWeeksIn3Months;
        double weightAfter3Months = presentWeight - numberOfLostKgIn3Months;
        System.out.println("Mugatu's weight after 3 months will be " + weightAfter3Months + " Kg");
    }

}