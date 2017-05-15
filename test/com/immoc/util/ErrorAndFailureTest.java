package com.immoc.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ErrorAndFailureTest {

	@Test
	public void testAdd() {
		assertEquals(6, new Caculate().add(3,3));
	}
	@Test
	public void testDivide() {
		assertEquals(6, new Caculate().divide(3,0));
	}
}
