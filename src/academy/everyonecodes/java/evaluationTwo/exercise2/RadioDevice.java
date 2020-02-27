package academy.everyonecodes.java.evaluationTwo.exercise2;


import java.util.List;
import java.util.Optional;

public class RadioDevice {

    private List<RadioAntenna> antennas = List.of(
            new Antenna3G(),
            new Antenna5G()
    );

    public Optional<String> receive(RadioMessage radioMessage) {
        Optional<RadioAntenna> matchedFrequency = antennas.stream()
                .filter(antenna -> antenna.getFrequency() == radioMessage.getFrequency())
                .findFirst();
        if (matchedFrequency.isPresent()) {
            return Optional.of(radioMessage.getContent());
        }
        return Optional.empty();
    }
}



