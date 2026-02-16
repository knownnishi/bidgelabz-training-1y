import java.util.*;
class Secondlargest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =input.nextInt();
		int max = 10;
		int digit[] = new int[max];
		int index =0;
		while (n!=0)
		{
			if (index==max)
			{
				break;
			}
			digit[index] = n%10;
			n=n/10;
			index++;
		}
		int largest  =0;
		int secondlargest  =0;
		for (int i=0;i<index;i++)
		{
			if(digit[i]>largest)
			{
				secondlargest = largest;
				largest=digit[i];
				
			}
			else if (digit[i]>secondlargest && digit[i]!=largest)
			{
				secondlargest = digit[i];
			}
		}
		System.out.println("largest number: "+largest);
		System.out.println("Second number: "+secondlargest);
		
	}
}