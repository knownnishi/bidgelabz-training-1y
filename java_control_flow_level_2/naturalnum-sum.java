import java.util.*;
class Naturalnum_sum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a;
		System.out.print("enter a natural number: ");
		a = input.nextInt();
		for (int i=1;i<=a;i++)
		{
			int d = a*(a+1)/2;
			System.out.println("the sum of natural number is: "+d);
		}
	}
}