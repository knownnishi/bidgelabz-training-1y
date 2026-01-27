import java.util.*;
class Multiple_backward
{
	public static void  main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a; 
		System.out.print("enter a number: ");
		a = input.nextInt();
		if (a<100)
		{
			System.out.println("the number is perfectly divide is" +a);
		}
		
		for(int i = 100;i>=1;i--)
		{
			
			if(a%i==0){
				System.out.println("the number is: "+i);
			}
		}
	}
}