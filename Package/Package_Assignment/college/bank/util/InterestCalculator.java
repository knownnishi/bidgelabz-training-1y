package com.bank.util;
import static java.lang.Math.*;

public class InterestCalculator {
    public double simpleInterest(double P,double R,double T){
        return(P*R*T)/100;
    }
    public double compundInterest(double P,double R,double T){
        return P*(pow((1+R/100),T))-P;
    }
}
