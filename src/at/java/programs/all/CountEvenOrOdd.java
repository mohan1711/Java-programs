package at.java.programs.all;

import java.util.Scanner;

public class CountEvenOrOdd 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int evencount = 0;
		int oddcount = 0;
		
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num = num/10;
		}
		System.out.println("The even digits are"+evencount);
		System.out.println("The odd digits are"+oddcount);
	}
}
