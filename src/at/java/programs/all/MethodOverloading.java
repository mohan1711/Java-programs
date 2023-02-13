package at.java.programs.all;

class MethodOverloading 
{
	static int myMethod(int x, int y)
	{
		return x+y;
	}
	static double myMethod(double x,double y)
	{
		return x+y;
	}
	public static void main(String[]args)
	{
		int myNum1 = myMethod(3,4);
		double myNum2 = myMethod(3.6,7.6);
		
		System.out.println(myNum1);
		System.out.println(myNum2);
	}
}
