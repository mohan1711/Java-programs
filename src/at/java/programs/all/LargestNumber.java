package at.java.programs.all;

import java.util.Scanner;

public class LargestNumber 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		System.out.println("Enter the third number");
		int c = scan.nextInt();

		if (a>b && a>c)
		{
			System.out.println("The largest number is"+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("The largest number is"+b);
		}
		else
		{
			System.out.println("The largest number is"+c);
		}

	}

}
