import java.util.Scanner;
class Harshad_number
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("enter a number: ");
		n  = input.nextInt();
		int sum =0;
	
		int digit;
		int original= n;
		while(n>0)
		{
			digit=n%10;
			
			sum +=digit;
			n =n/10;
			
		}
		System.out.println("the sum of digit is: "+sum);
		if (original%sum==0)
		{
			System.out.println("it is a harshad number");
			
		}
		else
		{System.out.println("it is not a harshad number");
		}
	}
}