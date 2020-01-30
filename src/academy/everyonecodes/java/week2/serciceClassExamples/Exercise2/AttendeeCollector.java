package academy.everyonecodes.java.week2.serciceClassExamples.Exercise2;

import academy.everyonecodes.java.week2.serciceClassExamples.Exercise2.Attendee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendeeCollector {

    public List<Attendee> collect() {
        Scanner scanner = new Scanner(System.in);

        List<Attendee> attendees = new ArrayList<>();

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        while (!name.equals("")) {
            System.out.println("What is your age?");
            int age = scanner.nextInt();

            Attendee nextAttendee = new Attendee(name, age);
            attendees.add(nextAttendee);

            System.out.println("What is your name?");
            name = scanner.nextLine();
        }

        return attendees;
    }

}
