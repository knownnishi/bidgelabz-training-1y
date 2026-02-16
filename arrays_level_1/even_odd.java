import java.util.*;
class Array_even_odd
{
	public static void main(String[] args)
	{
		Scanner input  = new Scanner(System.in);
		
		int arr[] = new int[6];
		
		
		for(int i =1;i<6;i++)
		{
			System.out.print(" Number "+i+":");
		arr[i]=input.nextInt();
		}
		for (int i = 1;i<6;i++)
		{
			if(arr[i]>0)
			{
				System.out.println("positive: " +arr[i]);
			}
			else if (arr[i]<0)
			{
				System.out.println("negative: " +arr[i]);
			}
			else
			{
				System.out.println("Zero: " +arr[i]);
			}
			
		}
		for (int i =1;i<6;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.println("even number: " +arr[i]);
			}
			else{
				System.out.println("odd number: " +arr[i]);
			}
		}
	}	