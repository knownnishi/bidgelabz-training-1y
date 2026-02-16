import java.util.*;
public class students
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner (System.in);
		System.out.print("Enter no. of students: ");
		int n=input.nextInt();
		String subject [] = {"Maths","Chemistry","Physics"};
		int marks[][] = new int[n][3];
	    double [] percent=new double[n];
		String [] grade=new String [n];

		for(int i=0;i<n;i++)
		{
			 System.out.println("Enter marks for student " + (i + 1));
		
			for(int j=0;j<3;j++)
			{
				System.out.print(subject[j]+" "+(j+1)+":");
				 marks[i][j]=input.nextInt();
			}
				percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
				if(percent[i]<39)
				{
					grade[i]="R";
				}
				else if(percent[i]<49)
				{
					grade[i]="E";
				}
				else if(percent[i]<59)
				{
					grade[i]="D";
				}
				else if(percent[i]<69)
				{
					grade[i]="C";
				}
				else if(percent[i]<79)
				{
					grade[i]="B";
				}
				else{
					grade[i]="A";
				}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("for student: " + (i+1));
			System.out.println("percentage: "+ percent[i]);
			System.out.println("grade : " +grade[i]);
		}
		
	}
} 