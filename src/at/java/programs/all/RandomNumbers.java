package at.java.programs.all;

import java.util.Random;

public class RandomNumbers 
{
	public static void main(String[] args) 
	{
		Random ran = new Random();
		int ranint = ran.nextInt(100);
		
		System.out.println(ranint);
	}
}
