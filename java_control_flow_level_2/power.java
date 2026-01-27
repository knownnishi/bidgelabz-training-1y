import java.util.*;
class power
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.print("enter a number: ");
		a= input.nextInt();
		
		if (a>0)
		{
			System.out.println("positive");
		}
		else 
		{
			System.out.println("not positive");
		}
		System.out.print("enter a power: ");
		b= input.nextInt();
		int result =1 ;
		for(int i=1; i<=b;i++)
		{
			result= a;
			
		}
		System.out.println("the power of result is:"+result);
	}
}