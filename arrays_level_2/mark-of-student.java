import java.util.*;
public class students
{
	public static void main(String[]args)
	{
		Scanner sy=new Scanner (System.in);
		System.out.print("Enter no. of students: ");
		int n=sy.nextInt();
		
		int [] maths=new int[n];
		int [] physics=new int[n];
		int [] chemistry=new int[n];
	    double [] percent=new double[n];
		String [] grade=new String [n];

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter marks of maths: ");
		    maths[i]=sy.nextInt();
			System.out.print("Enter marks of physics: ");
			physics[i]=sy.nextInt();
			System.out.print("Enter marks of chemistry: ");
			chemistry[i]=sy.nextInt();
		
			
		}
		for(int i=0;i<n;i++)
		{
			percent[i]=(maths[i]+physics[i]+chemistry[i])/3;
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
			System.out.println("total marks: " + (maths[i]+physics[i]+chemistry[i]));
			System.out.println("percentage: "+ percent[i]);
			System.out.println("grade : " +grade[i]);
		}
		
	}
} 