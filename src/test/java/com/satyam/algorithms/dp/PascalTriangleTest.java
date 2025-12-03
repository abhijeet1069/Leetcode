package com.satyam.algorithms.dp;

import org.junit.jupiter.api.Test;

import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    @Test
    void generate() {
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        assertEquals(list,pt.generate(1));
    }
}