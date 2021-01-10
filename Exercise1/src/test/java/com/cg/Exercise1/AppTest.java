package com.cg.Exercise1;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private App app;
	private static String ANY_SINGLE_NUMBER_AS_STRING = "300";
	private static int EXPECTED_SINGLE_NUMBER_AS_INTEGER = 300;

	@Before
	public void setup() {
		app=new App();
	}
	@Test
	public void testCalculate_GivenEmptyString_ShouldReturn0AsInteger() {
		int result = app.calculate("");
		assertEquals(0, result);
	}
	
	@Test
	public void testCalculate_Given1AsString_ShouldReturn1AsInteger() {
		int result = app.calculate(ANY_SINGLE_NUMBER_AS_STRING);
		assertEquals(EXPECTED_SINGLE_NUMBER_AS_INTEGER, result);
	}
	@Test
	public void testCalculate_Given1AND2AsStringSeparedByComma_ShouldReturn3AsInteger() {
		int result = app.calculate("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void testCalculate_Given1AND2And3AsStringSeparedByComma_ShouldReturn6AsInteger() {
		int result = app.calculate("4,7,1");
		assertEquals(12, result);
	}

}
