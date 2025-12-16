package com.satyam.algorithms.ds.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {

    @Test
    void removeDuplicateLetters1() {
        String s = "bcabc";
        assertEquals("abc", new RemoveDuplicateLetters().removeDuplicateLetters(s));
    }

    @Test
    void removeDuplicateLetters2() {
        String s = "cbacdcbc";
        assertEquals("acdb", new RemoveDuplicateLetters().removeDuplicateLetters(s));
    }
}