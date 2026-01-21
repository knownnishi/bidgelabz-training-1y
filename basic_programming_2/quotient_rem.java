import java.util.Scanner;
class quotient{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number 1: ");
		double n1 = input.nextDouble();
		System.out.println("enter the number 2: ");
		double n2 = input.nextDouble();
		double quotient = n2/n1;
		double rem = n2%n1;
		System.out.println("the quotient is: "+quotient);
		System.out.println("the rem is: "+rem);
	}
}