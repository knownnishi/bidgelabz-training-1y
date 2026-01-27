import java.util.*;
class Leapyear
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.print("enter a year: ");
		a = input.nextInt();
		if (a%100==0)
		{
			if(a%400==0)
			{
				System.out.println("leap year");
			}
		
			else 
			{
				System.out.println("not leap year");
			}
		}
		else{
			if (a%4==0)
		System.out.println(" leap year");
		else
			System.out.println("not leap year");
		}
		
	}
	}