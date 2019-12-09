package academy.everyonecodes.java.week1.set1.exercise4;

public class WateringMachine {

    public static void main(String[] args) {
        int numberOfPlants = 3;
        int numberOfPlantsToBuy = 9;
        int numberOfPlantsPerMachine = 4;
        int numberOfOwnedMachines = 1;
        double costOfWaterMachine = 20.0;
        double discount = 20 / 100;
        double discountedCost = costOfWaterMachine - (costOfWaterMachine * discount);
        int totalNumberOfPlants = numberOfPlants + numberOfPlantsToBuy;
        double numberOfTotalMachinesToBeUsed = totalNumberOfPlants / numberOfPlantsPerMachine;
        double numberOfWateringMachinesToBuy = numberOfTotalMachinesToBeUsed - numberOfOwnedMachines;
        double finalCost = discountedCost * numberOfWateringMachinesToBuy;
        System.out.println("Hansel will need to buy " + numberOfWateringMachinesToBuy +" and the final cost will be " + finalCost);

    }
}
