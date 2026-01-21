import java.util.Scanner;
class student {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("pen");
		double pen =input.nextDouble();
		System.out.println("student");
		double student = input.nextDouble();
		double quitent = pen/student;
		System.out.println("quitent="+quitent);
	}
}