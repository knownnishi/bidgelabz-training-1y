import java.util.Scanner;
class Kilometer
{
	public static void main(String[] args)
	{
     Scanner input = new Scanner (System.in);
	 System.out.println("Enter kilometer");
	 double a = input.nextDouble();
	 
	 double miles = a * 1.6;
	 System.out.println("kilometer_to_miles:-" +miles);

	}
}	 
	 