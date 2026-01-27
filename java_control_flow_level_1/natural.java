import java.util.Scanner;
class natural{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n>0){
			int sum = n*(n+1)/2;
			System.out.println("the sum of : " +sum+  "the natural number:" +n);
		}
		else {
			System.out.println("the number is not a natural number");
		}
	}
} 