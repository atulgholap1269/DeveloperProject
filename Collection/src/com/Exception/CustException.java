package com.Exception;

import java.util.Scanner;
class InvalidBinary extends RuntimeException
{
	public InvalidBinary()
	{
		super();
	}
	public InvalidBinary(String msg)
	{
		super(msg);
	}
}
public class CustException {
public static void checkIsBinary(int num)
{
	boolean isBinary=true;
	int copynum=num;
	while(num>0)
	{
		int digit=num%10;
		num=num/10;
		if(digit==0 || digit==1)
	    {
		 continue;	
		}
		else
		{
			isBinary=false;
			break;
		}
	}
	num=copynum;
	System.out.println(num);
	if(isBinary==false)
	{
		throw new InvalidBinary("number is not binary");
	}
	else
	{
		int decimalNumber=0, i=0;
		long remainder;
		while(num!=0)
		{
			remainder=num%10;
			num/=10;
			decimalNumber+=remainder*Math.pow(2, i);
			++i;
		}
		System.out.println("Decimal Number :"+decimalNumber);
	}
	
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	try
	{
	checkIsBinary(num);
	}
	catch(InvalidBinary o)
	{
		System.out.println(o.getMessage());
	}
}

}
