import java.util.*;
class Dayofweek
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int y,m,d;
		System.out.print("enter a year: ");
		y=input.nextInt();
		System.out.print("enter a month: ");
		m=input.nextInt();
		System.out.print("enter a day: ");
		d=input.nextInt();
		
		int y0=y-(14-m)/12;
		int x=y0+(y0/4)-(y0/100)+(y0/400);
		int m0=(m+12)*((14-m)/12)-2;
		int d0=(d+x+(31*m0)/12)%7;
		System.out.println("the day of week is: "+d0);
	}
}