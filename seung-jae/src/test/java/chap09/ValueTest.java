package chap09;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

class ValueTest {

    final Value v1 = new Value(10);
    final Value v2 = new Value(10);

    @Test
    void test() {
        assertFalse(v1.equals(v2));
    }

}