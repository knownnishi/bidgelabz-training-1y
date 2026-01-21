import java.util.Scanner;
class Intoperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num 1 ");
		int a=input.nextInt();
		System.out.println("enter the num 2 ");
		int b=input.nextInt();
		System.out.println("enter the num 3 ");
		int c=input.nextInt();
		int d= a+b*c;
		int e= a*b+c;
		int f= c+a/b;
		int g= a%b+c;
		System.out.println("result operation 1: "+d);
		System.out.println("result operation 2: "+e);
		System.out.println("result operation 3: "+f);
		System.out.println("result operation 4: "+g);
	}
}