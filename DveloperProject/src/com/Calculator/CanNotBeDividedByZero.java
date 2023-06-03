package com.Calculator;

public class CanNotBeDividedByZero extends Exception {
	
	public CanNotBeDividedByZero()
	{
		super();
	}
	public CanNotBeDividedByZero(String errMesg)
	{
		super(errMesg);
	}
	
}
