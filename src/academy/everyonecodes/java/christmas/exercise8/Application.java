package academy.everyonecodes.java.christmas.exercise8;

import java.util.List;

import static academy.everyonecodes.java.christmas.exercise8.Incremention.incrementByOne;

public class Application {
    public static void main(String[] args) {
        List<Integer> numbersInput = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> numbersOutput = incrementByOne(2, numbersInput);
    }
}
