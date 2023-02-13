package at.java.programs.all;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String str = scan.next();
		String rev = " ";

		// Using Algorithm
		int len = str.length(); //4

		for ( int i=len-1;i>=0;i--)  // 3 2 1 0
		{
			rev = rev+str.charAt(i);  // D C B A
		}

		System.out.println(" The reversed String is"+" "+rev);

	}

}
