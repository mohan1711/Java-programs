package at.java.programs.all;

import java.util.Scanner;

public class Palindrome_String 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
		String rev = "";
		int len = str.length();
		System.out.println("The length of the String is"+" "+len);
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("The reversed string is"+" "+rev);

		if (str.equals(rev))
		{
			System.out.println("The String is a palindrome");
		}
		else
		{
			System.out.println("The String is not a palindrome");
		}

	}

}
