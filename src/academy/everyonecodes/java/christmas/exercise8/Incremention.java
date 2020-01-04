package academy.everyonecodes.java.christmas.exercise8;

import java.util.List;

import static academy.everyonecodes.java.christmas.exercise8.ReplacedValue.replaceValue;

public class Incremention {

    public static List<Integer> incrementByOne(int position, List<Integer> values) {
        int current = values.get(position);
        return replaceValue(current++, position, values);
    }
}
