import java.util.Scanner;
class Intoperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num 1 ");
		double a=input.nextDouble();
		System.out.println("enter the num 2 ");
		double b=input.nextDouble();
		System.out.println("enter the num 3 ");
		double c=input.nextDouble();
		double d= a+b*c;
		double e= a*b+c;
		double f= c+a/b;
		double g= a%b+c;
		System.out.println("result operation 1: "+d);
		System.out.println("result operation 2: "+e);
		System.out.println("result operation 3: "+f);
		System.out.println("result operation 4: "+g);
	}
}