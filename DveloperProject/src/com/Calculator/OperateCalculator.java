package com.Calculator;

import java.util.Scanner;

public class OperateCalculator {
   public int add, sub, num1, num2;
    long mul;
    int div;
    char op;
    String option;
	public int addition(int num1, int num2)
	{
		add=num1+num2;
		return add;
	}
	
	public int substarction(int num1, int num2)
	{  
		sub=num1-num2;
		return sub;
	}
	public long multiplication(int num1, int num2) 
	{
		mul=num1*num2;
		return mul;
	}
	public int division(int num1, int divider) 
	{
		
		try {
		if (divider==0)
		{
			throw new CanNotBeDividedByZero("Number can not be divivded by Zero");
		}
		else
		{
			div=(num1/divider);
		}
		}
		catch(CanNotBeDividedByZero e)
		{
			System.out.println("Error message : "+e.getMessage());
		}
		return div;
	}
	public void performOperation()
	{
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter the operator ( +, - , * , / )");
		op=sc.next().charAt(0);
		switch(op)
		{
		case '+': System.out.println("Addition is : "+this.addition(num1, num2));
		break;
		case '-': System.out.println("Substraction is : "+this.substarction(num1, num2));
		break;
		case '*':System.out.println("Multiplication is : "+this.multiplication(num1, num2));
		break;
		case '/': System.out.println("Division is : "+this.division(num1, num2));
		break;
		default:System.out.println("error");
		
		}
		System.out.println("Do you want to perform another operation.........");
		System.out.println("Enter Yes or No");
		option=sc.next();
		}
		while(option.equalsIgnoreCase("Yes"));
		sc.close();
	}
	public static void main(String[] args) {
		OperateCalculator obj = new OperateCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		obj.num1=sc.nextInt();
		System.out.println("Enter second number");
	    obj.num2=sc.nextInt();
		
		obj.performOperation();
		sc.close();
	
		
	}


}
