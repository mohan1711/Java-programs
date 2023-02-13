package at.java.programs.all;

public class ArrayALL
{
	public static void main(String[] args) 
	{


		//>>>>>>>>>>>To print the sum of the array
		//Normal for loop
		//int []arr = {5,2,4,3,1};
		//int sum = 0;

		/*for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of array"+" "+sum);*/

		//Enhanced for loop
		/*for( int value : arr)
		{
			sum = sum+value;
		}	
		System.out.println(sum);*/


		//>>>>>>>>>>>>>>>>>>To search the element in an array

		/*int arr[] = { 10,20,30,40,50 };
		int search_ele = 60;
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			if(search_ele==arr[i])
			{
				System.out.println("The element is found at index"+i);
				flag = true;
				break;
			}

			if(flag == false)
			{
				System.out.println("Element not found");
				break;
			}*/

		//>>>>>>>>>>>>>>>>>>>>> Print even and odd numbers in an array
		
		/*int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("The even numbers are"+a[i]);
			}
			else 
			{
				System.out.println("The odd numbers are"+a[i]);
			}
		}*/
		
		//>>>>>>>>>>>>>>>Find greatest and smallest numbers in an array
		
		int num[] = {10,20,50,30,90,50,80,11,9};
		
		int small = num[0];
		int large = num[0];
		System.out.println(small);
		System.out.println(large);
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>large)
			{
				large = num[i];
			}
			else if(num[i]<small)
			{
				small = num[i];
			}
		}	
		System.out.println("largest "+large);
		System.out.println("smallest "+small);
	}
}
