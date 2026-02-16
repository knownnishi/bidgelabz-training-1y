import java.util.*;
public class reverse
{
	public static void main(String[]args)
	{
		Scanner sy= new Scanner(System.in);
		System.out.print("Enter a no: ");
		int n=sy.nextInt();
		int [] arr=new int[n];
		System.out.print("Enter an array : ");
		//int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sy.nextInt();
			//System.out.println(arr[i]+ " ");
			
		}
		System.out.println("length of the array is: "+ arr.length);
		System.out.println("Reverse of the array is: ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print( arr[i]+ " " ); 
						
		}
		
	}
}