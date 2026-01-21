import java.util.Scanner;

class miles{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("kilometer" );
	double kilo = input.nextDouble();
		double miles = kilo* 0.62137; 
		System.out.println("miles = "+miles );
	}
}