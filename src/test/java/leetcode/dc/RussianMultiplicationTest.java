package leetcode.dc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RussianMultiplicationTest {

    @Test
    void multiply() {
        RussianMultiplication mul = new RussianMultiplication();
        assertEquals(15, mul.multiply(5,3));
        assertEquals(15, mul.multiply(3,5));
        assertEquals(1012, mul.multiply(23,44));
    }
}