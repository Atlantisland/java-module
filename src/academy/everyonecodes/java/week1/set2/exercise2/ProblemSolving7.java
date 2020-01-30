package academy.everyonecodes.java.week1.set2.exercise2;

import java.util.List;
import java.util.ArrayList;

public class ProblemSolving7 {
    public static List<String> combine(List<String> first, List<String> second) {
        List<String> elementsCombined = new ArrayList<>();

        while (first.size() > 0 || second.size() > 0) {
            if (first.size() > 0) {
                String element = first.get(0);
                first.remove(0);
                elementsCombined.add(element);
            }
            if (second.size() > 0) {
                String element = second.get(0);
                second.remove(0);
                elementsCombined.add(element);
            }

        }
        return elementsCombined;
    }

    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        first.add("one");
        first.add("three");
        first.add("five");
        List<String> second = new ArrayList<>();
        first.add("one");
        second.add("two");
        second.add("four");

        List<String> combinedList = combine(first, second);
        for (String num : combinedList) {
            System.out.println(num);
        }
    }

}
