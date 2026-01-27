import java.util.*;
class factor
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int a;
		System.out.print("enter the number: ");
		a=input.nextInt();
		for (int i=1;i<=a;i++)
		{
			if (a%i==0)
			{
				System.out.println("factor is: "+i);
			}
		}
	}
}