package com.vnrvjiet.nazish.HouseCostEstimation;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class HouseCostTest {
	HouseCost housecost=new HouseCost();
	private static final double DELTA=1e-15;
	@Test
	public void test() {
		String input="Standard Material";
		assertEquals(36000.0f,housecost.calculateHouseCost(input,30),DELTA);
	}
	@Test
	public void test1() {
		String input="Above Standard Material";
		assertEquals(90000.0f,housecost.calculateHouseCost(input,60),DELTA);
	}
	@Test
	public void test2() {
		String input="High Standard Material";
		assertEquals(72000.0f,housecost.calculateHouseCost(input,40),DELTA);
	}
	@Test
	public void test3() {
		String input="High Standard Material and Fully Automated";
		assertEquals(500000.0f,housecost.calculateHouseCost(input,200),DELTA);
	}
}
