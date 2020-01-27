package academy.everyonecodes.java.christmas.exercise8;

import java.util.List;

public class IntegerListIncrementer {

    public List<Integer> incrementByOne(int position, List<Integer> values) {
        IntegerListValueReplacer replacer = new IntegerListValueReplacer();
        int oldValue = values.get(position);
        return replacer.replaceValue(oldValue + 1, position, values);
    }
}
