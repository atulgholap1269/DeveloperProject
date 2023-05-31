 package com.String;

import java.util.Scanner;

public class CountOfWord {
	public static void countOfWord(String str)
	{
		String sp[]=str.split(" ");
		for(int i=0; i<sp.length;i++)
		{
			int count=0;
			boolean checkDuplicate=false;
			for(int j=i-1; j>=0;j--)
              {
            	  if(sp[i].equals(sp[j]))
            	  {
            		  checkDuplicate=true;
            		  break;
            	  }
              }
			if(checkDuplicate==false)
			{
				for(int k=0; k<sp.length;k++)
				{
					if(sp[i].compareTo(sp[k])==0)         //        if(sp[i].equals(sp[k]))
					{
						count++;
					}
				}
				System.out.println(sp[i]+" "+ count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thye size of array");
		String ster = sc.nextLine();
		CountOfWord.countOfWord(ster);;
	}

}
