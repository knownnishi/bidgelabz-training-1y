import java.util.Scanner;

public class NaturalSum {
    
    static long sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }
    
    static long sumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (> 0)");
            return;
        }
        