import java.util.*;
class BMI
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double kg,height;
		System.out.print("enter the weight: ");
		kg = input.nextInt();
		System.out.print("enter the height: ");
		height =input.nextInt();
		double meter = height /100;
		double BMI = (kg/(meter*meter));
		System.out.println("body mass index is: "+BMI);
		if (BMI<=18.4)
		{
			System.out.println("Underweight");
		}
		else if (BMI>18.5 && BMI<=24.9)
		{
			System.out.println("Normal");
		}
		else if (BMI>25.0 && BMI<=39.9)
		{
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
	}
}	