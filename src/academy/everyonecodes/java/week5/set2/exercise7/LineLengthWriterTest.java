package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthWriterTest {
    LineLengthWriter writer = new LineLengthWriter();
    LineLengthReader reader = new LineLengthReader();


    @Test
    void writerFirstElement() {
        writer.write();
        List<Integer> resultLength = reader.read();

        Assertions.assertEquals(86, resultLength.get(0));
    }

    @Test
    void writerLastElement() {
        writer.write();
        List<Integer> resultLength = reader.read();

        Assertions.assertEquals(66, resultLength.get(resultLength.size()-1));
    }

    @Test
    void writerCheckSizes() {
        writer.write();
        List<Integer> resultLength = reader.read();

        Assertions.assertEquals(120, resultLength.size());
    }

}