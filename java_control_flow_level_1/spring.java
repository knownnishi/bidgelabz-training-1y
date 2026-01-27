import java.util.Scanner;
class spring{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("month");
		a=input.nextInt();
		System.out.println("date");
		b= input.nextInt();
		if((a==3 && b>=20) || (a==4) || (a==5) || (a==6 && b<=20 ))
		{
			System.out.println("spring season: ");
		}
		else{
			System.out.println("not spring season");
		}
		
	}
}