package academy.everyonecodes.java.optionals.maps.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class UserDataStoreTest {

    UserDataStore userDataStore = new UserDataStore();


    static Stream<Arguments> parameters() {

        User user1 = new User("user1", "pa55oRd");
        User user2 = new User("user2", "pa5soRd");
        return Stream.of(
                Arguments.of(Optional.empty(), ""),
                Arguments.of(Optional.of(user1), user1.getUsername()),
                Arguments.of(Optional.of(user2), user2.getUsername())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void getUserByUsernameTest(Optional<User> oExpected, String username) {
        Optional<User> oResult = userDataStore.getUserByUsername(username);

        Assertions.assertEquals(oExpected, oResult);
    }

}