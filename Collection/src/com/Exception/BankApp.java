package com.Exception;

public class BankApp {
public static void main(String[] args) {
	Account obj=new Account(1000, "Atul", 4000);
	System.out.println(obj);
//try
//	{
//		obj.withrow(2000);
//		obj.withrow(1500);
//	}
//	catch(InsufficientFundsException e)
//	{
//		e.printStackTrace();
//	}	
	
	   
		obj.withrowAmount(2000);
		obj.withrowAmount(1500);
	
	    // System.out.println(obj);
}
}
