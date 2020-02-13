package academy.everyonecodes.java.optionals.maps.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserDataStore {
    private Map<String, User> users;

    public UserDataStore() {
        User user1 = new User("user1", "pa55oRd");
        User user2 = new User("user2", "pa5soRd");
        users = new HashMap();
        users.put(user1.getUsername(), user1);
        users.put(user2.getUsername(), user2);
    }

    public Optional<User> getUserByUsername(String username) {
        if (users.containsKey(username)) {
            return Optional.of(users.get(username));
        }
        return Optional.empty();
    }

}
