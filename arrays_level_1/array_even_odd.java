import java.util.*;
class Even_odd
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		if (n <= 0) {
            System.out.println(" enter a natural number");
            return;
        }
		int size = n/2+1;
		int even[] = new int[size];
		int odd[] = new int[size];
		int eindex =0;
		int oindex =0;
		for (int i =1 ;i<=n;i++)
		{
			if(i%2==0)
			{
				even[eindex] = i;
				eindex++;
			}
			else {
				odd[oindex] = i;
				oindex++;
			}
		}
		System.out.println("even number: ");
		for (int i=0;i<eindex;i++)
		{
			System.out.print(even[i]+ " " );
		}
		System.out.println();
		System.out.println("odd number: ");
		for (int i=0;i<oindex;i++)
		{
			System.out.print(odd[i]+ " " );
		}
	}
}