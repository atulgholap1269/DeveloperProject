package com.ArrayProject;

public class NullPointer extends Exception {
String errMess;
public NullPointer()
{
	
}
public NullPointer(String str)
{
	errMess=str;
}
public String getMessage()
{
	return errMess;
}
}
