import java.util.Scanner;
class sumuntil_0{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a,sum=0;
		a=input.nextInt();
		
		while(a!=0)
		{
			sum= sum+a;
			a=input.nextInt();
		}
	System.out.println(+sum);
		
		
	}
}