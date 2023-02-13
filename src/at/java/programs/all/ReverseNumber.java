package at.java.programs.all;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int num = 12345;
		//int rev = 0;
		/*while (num>0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}*/
		
		StringBuffer str = new StringBuffer(String.valueOf(num));
		StringBuffer rev = str.reverse();
		
			System.out.println("Reversed number is "+rev);
			
			
	}
}
