import java.util.*;
class FactorsOfNumber
 {
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int max = 10;
        int fact[] = new int[max];
        int index = 0;
        for (int i = 1; i <= n; i++)
			{
        if (n % i == 0)
			{
       if (index == max) 
	   {
          max = max * 2;
          int temp[] = new int[max];
          for (int j = 0; j < index; j++) {
                temp[j] = fact[j];
             }
               fact = temp;
             }
             fact[index] = i;
             index++;
         }
       }
        System.out.println("Factors of " + n + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(fact[i] + " ");
        }
    }
}
