
package icc.pap.u1.patrones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

    @Test
    void testRunBuilder() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
