package at.java.programs.all;

public class StringsALL
{
	public static void main(String[] args)
	{
		/*String s = "Hello";
		String u = "World";
		
		//Finding length
		System.out.println("length of s"+" "+s.length()+" "+"length of u"+" "+u.length());
		
		//Concatenation
		System.out.println(s.concat(u));
		
		//Char at method
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(4));
		
		//Contains method
		System.out.println(s.contains("Hel"));*/
		
		//Reverse a string
		/*String r = "Mohanbabu";
		String rev = " ";
		System.out.println(r.length());
		int len = r.length();
		for(int i=len-1;i>=0;i--)
		{
		rev = rev + r.charAt(i);
		}
		System.out.println(rev);*/
		
		//Replace char, string, substring, lowercase, uppercase
		/*String a = "Sun";
		String b = "Book";
		System.out.println("Replace char"+a.replace('u', 'o'));
		System.out.println("Replace word"+b.replace("Book", "Bonus"));
		System.out.println(b.substring(1,4));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());*/
		
		//Find the element to search specific element in an array of strings
		
		String a[] = {"Mohan","Mani","Food","Paper"};
		String search = "Mani";
		Boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("The element is found at index"+" "+i);
				flag = true;
				break;
			}
			if(flag == false)
			{
				System.out.println("Element not found");
				break;
			}
		}
	}
}
