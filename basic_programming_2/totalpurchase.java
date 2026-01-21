import java.util.Scanner;
class totalpurchase {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the unitprice  = ");
		
		double unit= input.nextDouble();
		System.out.println("enter the quantity = ");
		double quantity =input.nextDouble();
		double totalprice = unit*quantity;
		System.out.println("the totalprice is: "+totalprice);
	}
}
