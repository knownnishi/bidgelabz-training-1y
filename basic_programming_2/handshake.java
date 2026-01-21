import java.util.Scanner;
class handshake {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number od student ");
		double n=input.nextDouble();
		double comb = (n*(n-1))/2;
		System.out.println("display the number of possible handshake = "+comb);
	}
}