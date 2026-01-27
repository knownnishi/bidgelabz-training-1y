import java.util.Scanner;
class four_fizzBuzz{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number: ");
		int a ;
		
		a=input.nextInt();
		
		for(int i=1;i<=a;i++)
		{
		if (i%4==0){
			System.out.println("fizzbuzz");
		}
		else
		{
			System.out.println(i);
		}
			
			
		}
	}
}