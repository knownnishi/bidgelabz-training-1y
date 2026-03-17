package com.bank.main;
import com.bank.util.InterestCalculator;

public class MainApp {
    public static void main(String args[]){
        InterestCalculator cal=new InterestCalculator();
        double P =10000;
        double R=4;
        double T=3;
        double si= cal.simpleInterest(P,R,T);
        double ci= cal.compundInterest(P,R,T);
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
