package com.shbhm.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions() {
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("BCDA", helper.truncateAInFirst2Positions("BCDA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));		
	}
}
