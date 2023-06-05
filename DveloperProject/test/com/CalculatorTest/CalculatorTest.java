package com.CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Calculator.OperateCalculator;

public class CalculatorTest {
	OperateCalculator obj = new OperateCalculator();
	@Test
	public void addTesting()
	{
		assertEquals(obj.addition(7, 7), 14);
	}
	@Test
	public void subTesting()
	{
		assertEquals(obj.substarction(7, 5), 2);
	}
	@Test
	public void mulTesting()
	{
		assertEquals(obj.multiplication(7, 5), 35);
	}
	@Test
	public void divTesting()
	{
		assertEquals(obj.division(10, 0), 2);
	}
}
