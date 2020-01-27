package academy.everyonecodes.java.christmas.exercise8;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        IntegerListIncrementer incrementer = new IntegerListIncrementer();
        List<Integer> numbersInput = List.of(1, 2, 3, 4, 5, 6);
        numbersInput = incrementer.incrementByOne(2, numbersInput);
    }
}
