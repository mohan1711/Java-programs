package at.java.programs.all;

public class DuplicateStringArray 
{
	public static void main(String[] args)
	{
		String arr[] = {"Java","C","Python","Ruby","php","Java"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				System.out.println("The duplicate array is"+" "+arr[i]);
				System.out.println("print array length"+arr.length);
				}
			}
		}

	}

}
