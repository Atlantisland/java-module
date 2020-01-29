package academy.everyonecodes.java.week6.set2.exercise3;

public class TemplateChooser {
    public String choose(String name) {
        if (name.startsWith("Ms.") || name.startsWith("Mrs.")) {
            return "female";
        }
        if (name.startsWith("Mr.")) {
            return "male";
        }
        if (name.startsWith("Hokopoko")) {
            return "privileged";
        }
        return "default";
    }
}
