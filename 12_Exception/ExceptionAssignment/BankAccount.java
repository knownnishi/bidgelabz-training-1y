package ExceptionAssignment;
import java.util.*;
class InsufficientBalanceException extends Exception {
    public static class BankAccount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();
            try {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                if (amt < 0)
                    throw new IllegalArgumentException();
                if (amt > balance)
                    throw new InsufficientBalanceException();
                balance = balance - amt;
                System.out.println("Withdrawal successful, new balance: " + balance);
            }
            catch (InsufficientBalanceException e) {
                System.out.println("Insufficient balance!");
            }
            catch (IllegalArgumentException e) {
                System.out.println("Invalid amount!");
            }
        }
    }
}