package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Animals {

    public static List<Animal> get() {
return List.of(new Mammal("dog", List.of("walk, run"), "brown"),
        new Mammal("gorilla", List.of("walk, run, climb"), "black"),
        new Bird("goose", List.of("walk, fly, swim"), "white"),
        new Bird("sparrow", List.of("jump, fly"), "brown"),
        new Fish("salmon", List.of("swim"), "saltwater"),
        new Fish("angelfish", List.of("swim"), "freshwater"),
        new Reptile("snake", List.of("crawl, climb"), false),
        new Reptile("turtle", List.of("crawl"), true),
        new Amphibian("frog", List.of("walk, jump, swim"), true),
        new Amphibian("caecilian", List.of("crawl, swim"), false),
        new Arthropod("spider", List.of("walk, climb"), 8),
        new Arthropod("butterfly", List.of("walk, climb, fly"), 6));
    }
}

        /*List<Animal> animals = new ArrayList<>();
        Animal dog = new Mammal("dog", List.of("walk, run"), "brown");
        Animal gorilla = new Mammal("gorilla", List.of("walk, run, climb"), "black");
        Animal goose = new Bird("goose", List.of("walk, fly, swim"), "white");
        Animal sparrow = new Bird("sparrow", List.of("jump, fly"), "brown");
        Animal salmon = new Fish("salmon", List.of("swim"), "saltwater");
        Animal angelfish = new Fish("angelfish", List.of("swim"), "freshwater");
        Animal snake = new Reptile("snake", List.of("crawl, climb"), false);
        Animal turtle = new Reptile("turtle", List.of("crawl"), true);
        Animal frog = new Amphibian("frog", List.of("walk, jump, swim"), true);
        Animal caecilian = new Amphibian("caecilian", List.of("crawl, swim"), false);
        Animal spider = new Arthropod("spider", List.of("walk, climb"), 8);
        Animal butterfly = new Arthropod("butterfly", List.of("walk, climb, fly"), 6);
        animals.add(dog);
        animals.add(gorilla);
        animals.add(goose);
        animals.add(sparrow);
        animals.add(salmon);
        animals.add(angelfish);
        animals.add(snake);
        animals.add(turtle);
        animals.add(frog);
        animals.add(caecilian);
        animals.add(spider);
        animals.add(butterfly);
        return animals;

    }

         */

