package academy.everyonecodes.java.week7.evaluationExercises.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class PictureNameExtractor {

    public List<String> extract(List<String> files) {
        List<String> result = files.stream()
                .map(name -> name.substring(8, name.length() - 7))
                .map(name -> name.toLowerCase())
                .map(name -> name.replaceAll("-", " "))
                .collect(Collectors.toList());
        return result;
    }
}
