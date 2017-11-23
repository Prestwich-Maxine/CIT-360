package AssertPractice;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

// Testing assertSame and assertNotSame

class convertClassTestSame {

    public void testDefaultIfNull() {

        String st = null;
        String defaultSt = "grand";

        String actual = convertClass.getDefaultIfNull(st, defaultSt);
        assertSame(defaultSt, actual);

        // Test with input not null
        st = "not empty";

        actual = convertClass.getDefaultIfNull(st, defaultSt);
        assertNotSame(defaultSt, actual);

        // Test if string is empty
        st = "";
        actual = convertClass.getDefaultIfNull(st, defaultSt);
        if (actual.equals(defaultSt)) {
            fail("The actual should be empty");
        }
    }


}