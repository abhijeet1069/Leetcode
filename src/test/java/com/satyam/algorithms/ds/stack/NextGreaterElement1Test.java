package com.satyam.algorithms.ds.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElement1Test {

    @Test
    void nextGreaterElement1() {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] output = new int[]{-1,3,-1};
        assertArrayEquals(output,NextGreaterElement1.nextGreaterElement(nums1,nums2));
    }

    @Test
    void nextGreaterElement2() {
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};
        int[] output = new int[]{3,-1};
        assertArrayEquals(output,NextGreaterElement1.nextGreaterElement(nums1,nums2));
    }
}