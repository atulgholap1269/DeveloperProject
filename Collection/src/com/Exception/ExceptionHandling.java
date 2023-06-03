package com.Exception;
class NegativeIndexException extends Exception
{
	public NegativeIndexException()
	{
		System.out.println("-ve number not allowed");
	}
	public NegativeIndexException(String msg)
	{
		super(msg);
	}
}
public class ExceptionHandling {
	
	public static void check (int base, int expo)throws NegativeIndexException
	{
		int pow=1;
		if(expo<0)
		{
			throw new NegativeIndexException("please give positive number as exponent");
		}
		else
		{
			for(int i=1;i<=expo;i++)
			{
				pow=pow*base;
			}
			System.out.println(pow);
		}
	}
	public static void main(String[] args) {
		try
		{
			ExceptionHandling.check(10, -2);
		}
		catch(NegativeIndexException e)
		{
			System.out.println("error message : "+e.getMessage());
		}
	}
  
}
