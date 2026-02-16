import java.util.*;
class Array_until_0
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double arr[] = new double[10];
		int  total= 0;
		int  index=0;
		while (true)
		{
			int  a = input.nextInt();
			if (a<=0)
			{
				break;
			}
			 if (index==10)
			{
				break;
			}
			arr[index] = a;
			index++;
		}
		for (int i=0;i<index;i++)
		{
			//System.out.println(arr[i]);
			total+=arr[i];
			
		}
		System.out.println(+total);
	}
		
	
}