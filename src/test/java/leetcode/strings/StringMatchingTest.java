package leetcode.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringMatchingTest {

	@Test
	void testContains() {
		assertEquals(2,StringMatching.contains("fi", "fefifofum"));
		assertEquals(6,StringMatching.contains("fum", "fefifofum"));
		assertEquals(-1,StringMatching.contains("smell", "fefifofum"));
	}

}
