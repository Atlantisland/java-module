package academy.everyonecodes.java.week6.set2.exercise3;

public class TemplateChooser {
    public String choose(String name) {
        if (isHokopokoFamily(name)) {
            return "privileged";
        }
        if (isMale(name)) {
            return "male";
        }
        if (isFemale(name)) {
            return "female";
        }
        return "default";
    }

    private boolean isHokopokoFamily(String name) {
        return name.contains("Hokopoko");
    }

    private boolean isMale(String name) {
        return name.startsWith("Mr.");
    }

    private boolean isFemale(String name) {
        return name.startsWith("Ms.") || name.startsWith("Mrs.");
    }

}
