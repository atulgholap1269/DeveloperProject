package com.Exception;

public class PropagateUnCheck {
public void m1()
{
	throw new NullPointerException("Null value");
}
public void n1()
{
	try
	{
		m1();
	}
	catch(NullPointerException e)
	{
		System.out.println("n1");
	}
}
public void p()
{
	n1();
}
public static void main(String[] args) {
	PropagateUnCheck obj= new PropagateUnCheck();
	obj.p();
	System.out.println("hiii");
}
}
