package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {
	
	@Test
	public void testSimpleAddition()
	{
		RPNCalculator rpnCalculator=new RPNCalculator();
		double actualResult=rpnCalculator.evaluate("10 15 +");
		double expectedResult=25.0;
		
		assertEquals (expectedResult,actualResult,0.0001);
		
		actualResult=rpnCalculator.evaluate("10 115 +");
		expectedResult=125.0;
		assertEquals (expectedResult,actualResult,0.0001);
	}
	@Test
	public void testSimpleSubstraction()
	{
		RPNCalculator rpnCalculator=new RPNCalculator();
		double actualResult=rpnCalculator.evaluate("100 50 -");
		double expectedResult=-50.0;
		
		assertEquals (expectedResult,actualResult,0.0001);
		
		actualResult=rpnCalculator.evaluate("100 20 -");
		expectedResult=-80.0;
		assertEquals (expectedResult,actualResult,0.0001);
	}
	@Test
	public void testSimpleMultiplication()
	{
		RPNCalculator rpnCalculator=new RPNCalculator();
		double actualResult=rpnCalculator.evaluate("100 50 *");
		double expectedResult=5000.0;
		
		assertEquals (expectedResult,actualResult,0.0001);
		
		actualResult=rpnCalculator.evaluate("100 20 *");
		expectedResult=2000.0;
		assertEquals (expectedResult,actualResult,0.0001);
	}


}
