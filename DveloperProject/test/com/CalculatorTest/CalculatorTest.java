package com.CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Calculator.OperateCalculator;

public class CalculatorTest {
	
	@Test
	public void addTesting()
	{
		OperateCalculator obj = new OperateCalculator();
		assertEquals(obj.addition(7, 7), 14);
	}
	@Test
	public void subTesting()
	{
		OperateCalculator obj = new OperateCalculator();
		assertEquals(obj.substarction(7, 5), 2);
	}
	@Test
	public void mulTesting()
	{
		OperateCalculator obj = new OperateCalculator();
		assertEquals(obj.multiplication(7, 5), 35);
	}
	@Test
	public void divTesting()
	{
		OperateCalculator obj = new OperateCalculator();
		assertEquals(obj.division(10, 0), 2);
	}
}
