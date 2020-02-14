package academy.everyonecodes.java.week7.reflection.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentPerformanceReader {
    private StudentPerformanceParser parser = new StudentPerformanceParser();
    private String file = "src/academy/everyonecodes/java/week7/reflection/files/students-performance.csv";

    public List<StudentPerformance> read() {
        Path path = Path.of(file);
        try {
            return Files.lines(path)
                    .skip(1)
                    .map(parser::parseLine)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

/*
package academy.everyonecodes.java.week7.reflection.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentPerformanceReader {

   private StudentPerformanceParser parser = new StudentPerformanceParser();
   private String file = "src/academy/everyonecodes/java/week7/reflection/files/students-performance.csv";

   public List<StudentPerformance> read() {
       Path path = Path.of(file);
       try {
           return Files.lines(path)
                   .skip(1)
                   .map(parser::parseLine)
                   .filter(Optional::isPresent)
                   .map(Optional::get)
                   .collect(Collectors.toList());
       } catch (IOException e) {
           e.printStackTrace();
           return new ArrayList<>();
       }
   }
}

 */
