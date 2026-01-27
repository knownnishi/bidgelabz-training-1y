import java.util.Scanner;
class breaksum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a,sum=0;
		a= input.nextInt();
		while(a!=0 &&  a>0){
			if(a==0)
				break;
			sum=sum+a;
			a= input.nextInt();
		}
		System.out.println("the sum is : " +sum);
	}
}