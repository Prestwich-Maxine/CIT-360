package AssertPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Test assertNotNull and assertEquals

class convertClassTest {

    // Test for not null and equals
    @Test
    public void testConvertToDouble() {
        String age = "1970";
        Double expAge = Double.valueOf(age);
        Double actual = convertClass.convertToDouble(age);

        assertAll("Do many assertions.", () -> {
            assertNotNull(actual);
            assertEquals(expAge, actual);
        });


    }
}