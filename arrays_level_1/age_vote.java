import java.util.Scanner;
class Age_vote
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] age= new int [10];
		for(int i =1;i<10;i++)
		{
			System.out.println("age of student: "+i);
		age[i]=input.nextInt();
		}
		
		for (int i=1;i<10;i++)
		{
			if(age[i]>=18)
			{
				System.out.println("eglible for vote: " +i);
			}
			else
			{
				System.out.println("not eglible for vote: "+i);
			}
		}
		
		
			
		
	}
}	