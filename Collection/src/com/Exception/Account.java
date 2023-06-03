package com.Exception;

public class Account {
	int acid;
	String name;
	float bal;

	public Account() {
		bal = 1000;
		acid = 0;
		name = "";
	}

	public Account(int acid, String name, float bal) {
		super();
		this.acid = acid;
		this.name = name;
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", name=" + name + ", bal=" + bal + "]";
	}

	public void deposit(int x) {
		bal = bal + x;
	}

	public void withrow(int x)throws InsufficientFundsException
	{
		 
		if (bal - x < 1000) {
			throw new InsufficientFundsException("minimum balance in account\"+\"min balance must be 1000 ");
		}
		else {
			bal = bal - x;
			System.out.println("updated balance : " + bal);
		}
		
		
	}
	public void withrowAmount(int x)
	{
		try {
		if (bal - x < 1000) {
	           throw new InsufficientFundsException("minimum balance in account"+"min balance must be 1000");
			} else {
				bal = bal - x;
				System.out.println("updated balance : " + bal);
			}
		}
		catch(InsufficientFundsException e)
		{
			Throwable t = new Throwable("Minimum funds rs 1000 is as per the bank rule");
		    e.initCause(t);
		    try
		    {
		    	throw e;
		    }
		    catch(InsufficientFundsException e1)
		    {
		    	System.out.println(e1.getCause());
		    	System.out.println(e1.getMessage());
		    	System.out.println(e.getClass());
		    }
		
		}
	}
	

}
