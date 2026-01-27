import java.util.*;
class Naturalnum_sum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,sumwhile=0;
		System.out.print("enter a natural number: ");
		a = input.nextInt();
		int i =1;
		while(i<=a)
		{
			sumwhile=i+sumwhile;
			i++;
		}
		int sum = a*(a+1)/2;
		System.out.println("the sumwhile is: "+sumwhile);
		System.out.println("the sum is: "+sum);
		if (sumwhile==sum)
		{
			System.out.println("the result is correct");
		}
		else
		{
			System.out.println("the result is incorrect");
		}
	}
}