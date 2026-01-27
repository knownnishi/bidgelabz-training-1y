import java.util.Scanner;
class age{
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		int age= input.nextInt();
		if (age>=18){
			System.out.println("the person can be vote");
		}
		else{
			System.out.println("the person cannot vote");
		}
		}
}