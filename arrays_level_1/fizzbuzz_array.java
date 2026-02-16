import java.util.*;
class U
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter a positve number: ");
		int a ;
		
		a=input.nextInt();
		String result[] = new String [20]; 
		if (a<0)
		{
			return;
		}
		for(int i=1;i<=a;i++)
		{
		if (i%3==0 && i%5==0){
			result[i]= "Fizzbuzz";
		}
		else if (i%3==0)
		{
				result[i]= "Fizz";
		}
		else if (i%5==0)
		{
				result[i]= "buzz";
		}
		else {
				result[i]= String.valueOf(i);
		}
			
			
		}
		
		
	
	for (int i =0 ; i<=a;i++)
	{
		System.out.println("positve " +i+ " = " +result[i]);
		}
	}
}	