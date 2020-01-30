/*package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HikerGatherer {

    public List<Hiker> gather() {
        Scanner scanner = new Scanner(System.in);
        List<Hiker> hikers = new ArrayList<>();
        System.out.println("What is your name?");
        String hikerName = scanner.nextLine();

        //Hiker nextHiker = new Hiker("", 0);

        while (!hikerName.equals("")) {
            System.out.println("What is your telephone number?");
            int telephoneNumber = scanner.nextInt();
            scanner.nextLine();

            Hiker nextHiker = new Hiker(hikerName, telephoneNumber);
            hikers.add(nextHiker);


            System.out.println("What is your name?");
            hikerName = scanner.nextLine();
        }
        return hikers;
    }
}

 */
