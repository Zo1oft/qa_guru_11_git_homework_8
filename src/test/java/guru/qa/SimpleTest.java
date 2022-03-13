package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 1);
    }

    @Test
    void assertFalseTest() {
        assertTrue(3 < 2);
    }

    @Test
    void assertFailTest() {
        Assertions.fail();
    }

    @Test
    void assertAnotherFailTest() {
        fail("another fail");
    }
}
