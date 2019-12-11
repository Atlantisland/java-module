package academy.everyonecodes.java.week1.examples2.exercise2;

import java.util.List;
import java.util.ArrayList;

public class Concatenate {
    public static List<String> concatenate(List<String> first, List<String> second) {
        List<String> concatenatedElements = new ArrayList<>();

        for (String element : first) {
            concatenatedElements.add(element);
        }

        for (String element : second) {
            concatenatedElements.add(element);
        }

        return concatenatedElements;
    }

    public static void main(String[] args) {
        List<String> first = List.of("one", "two", "three");
        List<String> second = List.of("four", "five", "six");
        for (String word : concatenate(first, second)) {
            System.out.println(word);
        }
    }
}
