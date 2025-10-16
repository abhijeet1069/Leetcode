package com.satyam.algorithms.intro.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DailyTemperaturesTest {

	@Test
	void testDailyTemperatures1() {
		int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
		int[] res = new int[] {1,1,4,2,1,1,0,0};
		DailyTemperatures obj = new DailyTemperatures();
		assertArrayEquals(res,obj.dailyTemperatures(temperatures));
	}
	
	@Test
	void testDailyTemperatures2() {
		int[] temperatures = new int[] {30,40,50,60};
		int[] res = new int[] {1,1,1,0};
		DailyTemperatures obj = new DailyTemperatures();
		assertArrayEquals(res,obj.dailyTemperatures(temperatures));
	}
	
	@Test
	void testDailyTemperatures3() {
		int[] temperatures = new int[] {30,60,90};
		int[] res = new int[] {1,1,0};
		DailyTemperatures obj = new DailyTemperatures();
		assertArrayEquals(res,obj.dailyTemperatures(temperatures));
	}

}
