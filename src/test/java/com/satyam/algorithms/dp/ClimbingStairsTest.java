package com.satyam.algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {
        ClimbingStairs cs = new ClimbingStairs();
        assertEquals(2,cs.climbStairs(2));
        assertEquals(3,cs.climbStairs(3));
    }
}