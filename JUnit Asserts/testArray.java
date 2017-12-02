package AssertPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class testArray {

    @Test
    public void testArrayClass() {

        arrayClass ac = new arrayClass();
        int expected[] = new int []{3,8};
        assertArrayEquals(expected, ac.addToArray(new int[]{2, 7}));

    }

}