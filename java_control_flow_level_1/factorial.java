import java.util.Scanner;
class factorial
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.print("enter a number: ");
		a = input.nextInt();
		int fact = 1;
		int i = 1;
		while(i<=a)
		{
			
			fact =fact*i;
			i++;
		}
		
		System.out.println("the factorial of number is: "+fact);
	}
}