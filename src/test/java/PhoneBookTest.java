import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.PhoneBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    String name = "Anton";
    long number = 9111822306L;

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
    @Test
    public void FindByNumberTest(){
        phoneBook.add(name,number);
        String actual = phoneBook.findByNumber(number);
        assertEquals("Anton", actual);

    }
    @Test
    public void FindByNameTest(){
        phoneBook.add(name,number);
        long actual = phoneBook.findByName(name);
        assertEquals(9111822306L, actual);
    }
    @Test
    public void printAllNames() {

        phoneBook.add("Anna", 91234567890L);
        phoneBook.add("Alena", 97987654321L);
        phoneBook.add("Ruslan", 97980654321L);
        phoneBook.add("Fedora", 97987554321L);
        phoneBook.add("Vanya", 97937554321L);

        List<String> expected = new ArrayList<>(Arrays.asList("Alena", "Anna","Fedora","Ruslan","Vanya"));
        List<String> actual = phoneBook.printAllNames();

        assertEquals(expected, actual);
    }
}

