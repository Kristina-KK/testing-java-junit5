package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1l, "Joe", "Buck");

        // then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(), "Buck"));

    }

    @Test
    void groupedAssertionsMsgs() {
        // given
        Person person = new Person(1l, "Joe", "Buck");

        // then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe2", "First name failed"),
                () -> assertEquals(person.getLastName(), "Buck2", "Last name failed"));

    }

}