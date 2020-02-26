package academy.everyonecodes.java.evaluation2.optionals.Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class ViewCounter {

    private Set<String> viewersIPAdresse;

    public void addViewerIPAddress(String IPAddress) {
        Set<String> viewersIPAdresse = new LinkedHashSet<>();
        viewersIPAdresse.add(IPAddress);
    }

    public int countUniqueViews() {
        return viewersIPAdresse.size();
    }

}
