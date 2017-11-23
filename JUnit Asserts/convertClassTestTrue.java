package AssertPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Test for assertTrue and assertFalse. Use of assertThat.

class convertClassTestTrue {

    @Test  // Test for true; test for false
    public void testIsNullOrEMpty() {
        String input = null;

        assertTrue(convertClass.isNullOrBlank(input));

        // Test when input is not null or empty
        input = "grand";
        assertFalse(convertClass.isNullOrBlank(input));
    }

}