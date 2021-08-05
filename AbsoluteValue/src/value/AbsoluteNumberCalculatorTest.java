package value;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expecter = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expecter, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expecter = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expecter, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expecter = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expecter, result);
    }
}

