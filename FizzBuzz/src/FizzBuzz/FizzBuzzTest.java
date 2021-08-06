package FizzBuzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzz1() {
        String result = FizzBuzz.FizzBuzz(3);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    void fizzBuzz2() {
        String result = FizzBuzz.FizzBuzz(5);
        String expected = "Buzz";
        assertEquals(expected, result);
    }

    @Test
    void fizzBuzz3() {
        String result = FizzBuzz.FizzBuzz(15);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }
}
