import java.util.Scanner;
class arithematic{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numner 1");
		float a = input.nextFloat();
		System.out.println("enter the numner 2");
		float b = input.nextFloat();
		float c =a+b;
		float d = a-b;
		float e = a*b;
		float f = a/b;
		System.out.println("Arithematic of operation"+c +d +e +f);
	}
}