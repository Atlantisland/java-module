package academy.everyonecodes.java.week1.examples2.exercise3;

import java.util.List;
import java.util.ArrayList;

public class FindFirst {

    public static int findFirst(String target, List<String> elements) {
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            String currentElement = elements.get(i);
            if (currentElement.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> itemsOnShoppingList = new ArrayList<>();
        itemsOnShoppingList.add("bread");
        itemsOnShoppingList.add("butter");
        itemsOnShoppingList.add("apples");
        itemsOnShoppingList.add("milk");
        itemsOnShoppingList.add("spaghetti");
        itemsOnShoppingList.add("ham");

        int position = findFirst("milk", itemsOnShoppingList);

        System.out.println("Milk is at position " + position);
    }
}
