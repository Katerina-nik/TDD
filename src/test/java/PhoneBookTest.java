import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.PhoneBook;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @ParameterizedTest
    @MethodSource("argAdd")
    public void testAdd(String name, long number, int expected ) {
        int actual = phoneBook.add(name, number);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> argAdd(){
        return Stream.of(Arguments.of("Vasya", 9111822309L, 1),
                Arguments.of("Petya", 9110000001L, 2),
                Arguments.of("Vasya", 9111822309L, 2));
    }
}
