package com.Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class PropagationCheckException {
 public void task1()throws IOException
 {
	 task2();
 }
 public void task2()throws IOException
 {
	 task3();
 }
// public void task3()
// {
//	 try {
//	 FileInputStream fin=null;
//	 fin= new FileInputStream("C:\\Users\\DELL\\Desktop\\TQ notes\\file1.txt");
//	 int ch = fin.read();
//	 while(ch!=-1)
//	 {
//		 System.out.println((char)(ch));
//		 ch=fin.read();
//	 }
//	 
//	 }
//	 catch(IOException e)
//	 {
//		 e.printStackTrace();
//		 System.out.println(e.getMessage());
//	 }
// }
 public void task3() throws IOException
 {
	 FileInputStream fin=null;
	 fin= new FileInputStream("C:\\Users\\DELL\\Desktop\\TQ notes\\file1.txt");
	 int ch = fin.read();
	 while(ch!=-1)
	 {
		 System.out.println((char)(ch));
		 ch=fin.read();
	 } 
 }
 public static void main(String[] args)throws IOException {
	
	 PropagationCheckException obj = new PropagationCheckException();
     obj.task3();
//	 try {
//	 obj.task3();
//	 }
//	 catch(IOException e)
//	 {
//		 System.out.println(e.getMessage());
//	 }
}
}
