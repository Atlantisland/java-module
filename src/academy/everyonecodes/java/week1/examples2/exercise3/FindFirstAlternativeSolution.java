package academy.everyonecodes.java.week1.examples2.exercise3;

import java.util.List;
import java.util.ArrayList;

public class FindFirstAlternativeSolution {

    public static int findFirst(String target, List<String> elements) {
        return elements.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> itemOnShoppingList = new ArrayList<>();
        itemOnShoppingList.add("bread");
        itemOnShoppingList.add("butter");
        itemOnShoppingList.add("apples");
        itemOnShoppingList.add("milk");
        itemOnShoppingList.add("spaghetti");
        itemOnShoppingList.add("ham");

        int position = findFirst("milk", itemOnShoppingList);

        System.out.println("Milk is at position " + position);
    }
}
