import java.util.Scanner;
class fizzBuzz{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number: ");
		int a ;
		a=input.nextInt();
		
		for(int i=1;i<=a;i++)
		{
		if (i%3==0 && i%5==0){
			System.out.println("fizzbuzz");
		}
		else if (i%3==0)
		{
			System.out.println("fizz");
		}
		else if (i%5==0)
		{
			System.out.println("buzz");
		}
		else {
			System.out.println(i);
		}
			
			
		}
	}
}