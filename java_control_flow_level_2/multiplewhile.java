import java.util.*;
class Multiple_backward
{
	public static void  main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a; 
		System.out.print("enter a number: ");
		a = input.nextInt();
		if (a>0 && a<=100)
		{
			System.out.println("positive number below than 100");
		}
		else 
		{
			System.out.println("not positive number below than 100")
		}
	
		int i =a;
		while (i<100)
		{
		System.out.println("the multiple number is: "+i);
			i= i+a;
			}
	}
}