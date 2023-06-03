package com.Exception;

public class UnCheckExceptionPropagation {
  public static void task3()
  {
	  int a=0;
	  int b=9;
	  System.out.println("Division is: "+b/a);
  }
  public static void task2()
  {
	  task3();
  }
  public static void task1()
  {
	  try
	  {
		  task2();
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Runtime exception propagation:");
		  System.out.println("Type of class: "+e.getClass());
		  System.out.println("Error mesaage : "+e.getMessage());
	  }
  }
  public static void main(String[] args) {
	task1();
}
}
