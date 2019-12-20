package academy.everyonecodes.java.week2.serciceClassExamples.examplesTwo;

public class Key {
    private String holderName;
    private String keyphrase;

    public Key(String holderName, String keyphrase) {
        this.holderName = holderName;
        this.keyphrase = keyphrase;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getKeyphrase() {
        return keyphrase;
    }
}
