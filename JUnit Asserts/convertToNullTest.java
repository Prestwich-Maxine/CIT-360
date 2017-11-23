package AssertPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

// Test assertNull

class convertToNullTest {

    // Test for null
    @Test
    public void testConvertToNull() {
        String age = null;
        Double actual = convertClass.convertToDouble(age);
        assertNull(actual, "The actual is not null");
    }

}