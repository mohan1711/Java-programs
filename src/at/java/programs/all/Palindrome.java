package at.java.programs.all;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int org_num=num;
		int rev = 0;

		while(num>0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		if (org_num==rev)
		{
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}
}
