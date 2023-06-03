package com.Exception;

public class InsufficientFundsException extends Exception{
  String errMes;
  public InsufficientFundsException()
  {
	  
  }
  public InsufficientFundsException(String str)
  {
	  errMes=str;
  }
  public String getMessage() 
  {
	   return errMes;
  }
}
