package academy.everyonecodes.java.christmas.exercise8;

import java.util.ArrayList;
import java.util.List;

public class IntegerListValueReplacer {

    public List<Integer> replaceValue(int newValue, int position, List<Integer> numbers) {
        List<Integer> numbersModified = new ArrayList<>();
        int count = 0;
        int size = numbers.size();
        for (int number : numbers) {
            if (count == position) {
                numbersModified.add(newValue);
            } else {
                numbersModified.add(number);
            }
            count++;
        }
        return numbersModified;
    }
}
