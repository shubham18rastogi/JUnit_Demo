package com.shbhm.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort() {
		int[] numbers = {4,1,3,2,5};
		int[] expected = {1,2,3,4,5};
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySortNPE() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	@Test(timeout = 20)
	public void testSort_Performance() {
		int array[] = {1,4,6};
		for(int i=0; i<1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
