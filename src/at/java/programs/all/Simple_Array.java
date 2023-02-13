package at.java.programs.all;

import java.util.Scanner;

public class Simple_Array 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String arr[]=new String[3];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the name of the employees"+i);
			arr[i]=scan.next();
		}

		System.out.println("The name of the employees are");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
