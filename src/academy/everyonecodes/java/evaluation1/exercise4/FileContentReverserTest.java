package academy.everyonecodes.java.evaluation1.exercise4;


import academy.everyonecodes.java.evaluation1.commonClasses.FileReader;
import academy.everyonecodes.java.evaluation1.commonClasses.FileWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileContentReverserTest {
    FileContentReverser reverser = new FileContentReverser();
    FileReader reader = new FileReader();

    String pathInput = "src/academy/everyonecodes/java/evaluation1/files/lines.txt";
    String pathOutputExpected = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed_expected.txt";
    String pathOutput = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed.txt";

    @Test
    void reverse() {

        reverser.reverse(pathInput, pathOutput);

        List<String> expected = reader.read(pathOutputExpected);
        List<String> result = reader.read(pathOutput);

        Assertions.assertLinesMatch(expected, result);
    }

    //@AfterEach
    //void deleteFile() {
    //    Path path = Path.of(pathOutput);
    //    try {
    //        Files.deleteIfExists(path);
    //    } catch (IOException e) {
    //        e.printStackTrace();
     //   }

    }
