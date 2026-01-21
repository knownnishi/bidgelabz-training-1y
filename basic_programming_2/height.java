import java.util.Scanner;
class height {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("foot");
		double foot = input.nextDouble();
		double inches = foot *12;
		double centi = inches*2.54;
		System.out.println("inches = "+inches);
		System.out.println("centimeter = "+centi);
	}
}