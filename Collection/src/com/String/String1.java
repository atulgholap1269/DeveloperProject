package com.String;

public class String1 {
   public static void main(String[] args) {
	   String s = new String("pune");//when we declare string with new keyword every time new instance created and object are created in heap and string constant pool
	   String city="pune";// when string declare with literal then object created in string constant pool.
	   String myCity="pune";
	   System.out.println(city==s);// output = false. even if the both have same value but memory location is different.
	   System.out.println(city+" "+myCity);
	   System.out.println(city==myCity);//output = True. both have same value and declare with literals.i.e 
	   System.out.println(city.hashCode());//both  have same hash-code
	   System.out.println(myCity.hashCode());//both  have same hash-code
	   city=city+" Welcome";// when we change value of city then it store another memory location. so it is not affect on value myCity. i.e, String is immutable
	   System.out.println(city+" "+myCity);
	   System.out.println(city.hashCode());//hash-code is different.
	   System.out.println(myCity.hashCode());
}
}
