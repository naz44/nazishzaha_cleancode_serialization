package com.vnrvjiet.nazish.SimpleAndCompoundInterest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CompoundInterestDemo {
	CompoundInterest compoundinterest=new CompoundInterest();
	public static final double DELTA=1e-15;//for dealing with floating point calculations
	@Test
	public void test() {
		double expectedCI=252.00000000000023;
		assertEquals(expectedCI,compoundinterest.CalculateCompoundInterest(1200, 2, 10),DELTA);
	}
}
