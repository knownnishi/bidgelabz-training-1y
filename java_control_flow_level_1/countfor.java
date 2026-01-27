
import java.util.Scanner;
class countfor{
	public static  void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a , b ,count=0;
		a=input.nextInt();
		for(a>0)
		{
			b=a-1;
			if (b%10==0)
			{
				count++;
			}
			a=a/10;
		}
		System.out.println("the count is: " +count);
	}
}