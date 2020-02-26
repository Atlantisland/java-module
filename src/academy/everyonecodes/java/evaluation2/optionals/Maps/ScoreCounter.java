package academy.everyonecodes.java.evaluation2.optionals.Maps;

import java.util.Map;

public class ScoreCounter {

    private Map<String, Integer> winnerInformation;

    public void saveRoundWinner(String name) {
        name = getWinner();
        winnerInformation.put(name, 1);
        //winnerInformation.put(name, 1);
    }

    public String getWinner() {
        Map<String, Integer> playersScores = winnerInformation;
        Map.Entry<String, Integer> maxScore = null;
        for (Map.Entry<String, Integer> entry : playersScores.entrySet()) {
            if (maxScore == null || entry.getValue().compareTo(maxScore.getValue()) > 0) {
                maxScore = entry;
            }
        }
        return maxScore.getKey();
    }
}
