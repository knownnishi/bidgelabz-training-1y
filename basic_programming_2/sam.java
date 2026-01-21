import java.util.Scanner;
class sam {
	public static void main(String[] args){
		Scanner input  =new Scanner (System.in);
		System.out .println("math ");
		double  math=input.nextDouble ();
		System.out.println("physics");
		double physics = input.nextDouble();
		System.out.println("chemistry");
		double chemistry=input.nextDouble();
		double average = math+chemistry+physics/3;
		System.out.println(+average);
	}
}