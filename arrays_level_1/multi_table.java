import java.util.*;
class Array_multi_table
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		int arr[] = new int[11];
		for (int i =1;i<11;i++)
		{
			int result = n*i;
			System.out.println(+n+ " * " +i+ " = " +result);
		}
		
		
	}
}