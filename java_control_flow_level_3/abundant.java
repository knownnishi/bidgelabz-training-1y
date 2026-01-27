 import java.util.Scanner;
class Abundant_number
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("enter a number: ");
		n  = input.nextInt();
		int sum=0;
		int i =0;
		while(i<=n/2)
		{
			i++;
			if (n%i==0){
				sum+=i;
			}
		}
		System.out.println("the sum of factor "+sum);	
		if (sum>n)
		{
			System.out.println("Abundant_number");
		}
		else
		{
			System.out.println(" not Abundant_number");
		}
		
	}
}