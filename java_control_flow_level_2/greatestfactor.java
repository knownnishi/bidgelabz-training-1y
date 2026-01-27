import java.util.*;
class factor
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int a ;
		System.out.print("enter a number: ");
		a=input.nextInt();
		int gt=1;
		for (int i=a-1;i>=1;i--)
		{
			if(a%i==0)
			{
				gt=i;
				break;
				
			}
		}
		System.out.println(+gt);
		
	}
}