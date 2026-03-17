import java.util.Scanner;

public class FactorFinder {
    
    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;
        
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[idx++] = i;
        
        return factors;
    }
    
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    static long sumOfSquares(int[] factors) {
        long sum = 0;
        for (int f : factors) sum += (long) Math.pow(f, 2);
        return sum;
    }
    
    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int[] factors = findFactors(n);
        
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        
        System.out.println("\nSum of Factors: " + sumOfFactors(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        
        sc.close();
    }
}
