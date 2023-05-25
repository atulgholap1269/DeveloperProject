package com.arrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

class Menu
   {
	   int mId;
	   String mName;
	   int prize;
	
	public Menu(int mId, String mName, int prize) {
		
		this.mId = mId;
		this.mName = mName;
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "mId=" + mId + ", mName=" + mName + ", prize=" + prize ;
	}
   }

public class Order {
   int oId;
   int quantity;
   Menu menu[];
   public Order(int oId, int quantity,Menu menu[]  )
   {
	   this.oId=oId;
	   this.quantity=quantity;
	   this.menu=menu;
   }
   public String toString()
   {
	   return "order id:"+oId+" quantity : "+quantity+" menu items: "+Arrays.toString(menu);
   }
   
   public static void main(String[] args) {
	   int Bill;
	   int totalBill=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of Order");
	int order= sc.nextInt();
	Order o[]=new Order[order];
	System.out.println("Enter the order details");
	for(int i=0; i<o.length;i++)
	{
	System.out.println("enter order id:");
	int oId= sc.nextInt();
	System.out.println("Enter quantity");
	int qaun=sc.nextInt();
	System.out.println("Enter no of menu items:");
	int  no=sc.nextInt();
	Menu menu[]=new Menu [no];
	Bill=0;
	for(int j=0;j<menu.length;j++)
	{
	System.out.println("menu id:");
	int id= sc.nextInt();
	System.out.println("Menu name:");
	String name= sc.next();
	System.out.println("menu price");
	int price= sc.nextInt();
	menu[j]=new Menu(id, name,price);
	Bill =Bill+qaun*price;
	
	}
	totalBill=totalBill+Bill;
	o[i]=new Order(oId, qaun, menu);
	}
	
	for(Order or:o)
	{
		System.out.println(or);
	}
	System.out.println("Total Bill = "+totalBill);
}
}
