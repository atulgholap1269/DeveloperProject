package com.String;

public class VardatatypeAgument {
public void show(String str, int ...a)
{
	System.out.println(str);
	for(int x:a)
	{
		System.out.print(x+" ");
	}
	System.out.println();
}
public static void main(String[] args) {
	VardatatypeAgument obj = new VardatatypeAgument();
	obj.show("pune", 20);
	obj.show("pune", 20,30,40,50);
	obj.show("pune", 20,40,50);
	obj.show("pune" );
}
}
