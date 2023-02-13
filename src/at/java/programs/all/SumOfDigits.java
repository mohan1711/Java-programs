package at.java.programs.all;
import java.util.Scanner;
public class SumOfDigits 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int sum = 0;

		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("The number sum"+" "+sum);
	}
}
