import java.util.Scanner;
class area{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("base");
		double base = input.nextDouble();
		System.out.println("height");
		double height = input.nextDouble();
		double areainche = 0.5*base*height;
		double area = areainche*areainche;
		double centi = areainche*6.545;
		
		
		System.out.println("Area of triangle in square = "+area  );
		System.out.println("Area of triangle in square in centi = "+centi  );
	}
}