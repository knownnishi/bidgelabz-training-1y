import java.util.Scanner;
class  earth {
	public static void main(String[] args){
		Scanner input  =new Scanner (System.in);
		System.out .println("radius of kilometer ");
		double  radius=input.nextDouble ();
		
		double volume_cube = (4/3)*3.14*radius*radius*radius;
		double miles = volume_cube*0.62197;
		System.out.println("volume of earth in kilometer= "+volume_cube);
		System.out.println("miles= "+miles );
		
	}
}