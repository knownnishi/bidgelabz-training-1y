import java.util.*;
class Switch_calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1,num2,value;
		System.out.print("enter the first number: ");
		num1 = input.nextInt();
		System.out.print("enter the second number: ");
		num2 = input.nextInt();
		System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
		value = input.nextInt();
		
		switch (value) 
		{
			case 1 int sum = num1+num2;
			System.out.println("the sum of two number: "+sum);
			break;
			case 2 :
			System.out.println("the subof two number: "+(num1-num2));
			break;
			case 3 :
			System.out.println("the multi of two number: "+(num1*num2));
			break;case 4:
			System.out.println("the divide of two number: "+(num1/num2));
			break;
	
			default :
			System.out.println("invalid operator");
		}	
		
	}
}