import java.util.Scanner;
class yards{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the distance in feet ");
		double feet =input.nextDouble();
		double yard = feet/3;
		double mile = feet/5280;
		System.out.println("yard = "+yard);
		System.out.println("mile = "+mile);
	}
}