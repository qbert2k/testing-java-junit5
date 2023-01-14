package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1L, "Joe", "Buck");

        // then
        assertAll("Test props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsg() {
        // given
        Person person = new Person(1L, "Joe", "Buck");

        // then
        assertAll("Test props Set",
                () -> assertEquals("Joe", person.getFirstName(), "First Name failed"),
                () -> assertEquals("Buck", person.getLastName(), "Last Name failed"));
    }
}