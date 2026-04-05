package Assignment13;

import java.util.Scanner;

public class Question1 {
    public void primitiveToWrapper() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:-");

        int num1 = sc.nextInt();
        Integer num2 = num1;

        System.out.println("primitive:-" + num1);
        System.out.println("Wrapper" + num2);


    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.primitiveToWrapper();
    }
}