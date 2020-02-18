package com.vnrvjiet.nazish.SimpleAndCompoundInterest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class SimpleInterestDemo{
	SimpleInterest simpleinterest=new SimpleInterest();
	private static final double DELTA=1e-15;//for dealing with floating point calculations
	@Test
	public void test() {
		double expectedSI=240.0;
		assertEquals(expectedSI,simpleinterest.CalculateSimpleInterest(1200, 2, 10),DELTA);
	}
}