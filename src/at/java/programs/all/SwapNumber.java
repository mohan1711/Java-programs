package at.java.programs.all;

public class SwapNumber 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		System.out.println("before swap "+a+" "+b);
		
		//By third variable
		/*int t = a;
		a = b;		//<----  b value to a
		b = t;		//<----  t value to b*/
		
		//By arithmetic operators
		/*a = a+b;
		b = a-b;
		a = a-b;*/
		
		//By * and / operators
		a = a*b;
		b = a/b;
		a = a/b;
		
		
		
		System.out.println("after swap "+a+" "+b);
	}
}
