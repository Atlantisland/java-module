package academy.everyonecodes.java.optionals.maps.exercise1;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringsToLenghtMapper {

    public Map<String, Integer> map(List<String> strings) {
        //System.out.println("list: " + strings);
        Map<String, Integer> stringsToLength = new HashMap<>();
        for (String word : strings) {
            stringsToLength.put(word, word.length());
        }
        //System.out.println("map: " + stringsToLength);
        return stringsToLength;
    }
}
