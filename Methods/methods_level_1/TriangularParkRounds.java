import java.util.Scanner;

public class TriangularPark {
    public static double computeRounds(double a, double b, double c) {
        double perimeter = a + b + c;          // in meters
        double targetDistance = 5000;          // 5 km in meters
        return Math.ceil(targetDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double c = sc.nextDouble();

        double rounds = computeRounds(a, b, c);
        System.out.println("Rounds needed to complete 5 km run: " + (int) rounds);
    }
}