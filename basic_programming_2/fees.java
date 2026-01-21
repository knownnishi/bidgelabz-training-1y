import java.util.Scanner;
class  fees {
	public static void main(String[] args){
		Scanner input  =new Scanner (System.in);
		System.out .println("fees");
		double  fees=input.nextDouble ();
		System.out.println("discount");
		double discount= input.nextDouble();
		double fess_sub= (fees/100)*10;
		double pay = fees - fess_sub;
		System.out.println(+fess_sub);
		System.out.println(+pay);
		
	}
}