package com.company;
import java.util.Scanner;

public class initialInputs {
    Scanner sc = new Scanner(System.in);
    private static double bodyWeight;
    private double height;
    private double age;


    public static double bodyInputs(){
        Scanner sc = new Scanner(System.in);
        this.bodyWeight = bodyWeight;
        System.out.print("Hello, please enter your body weight: ");
        double bodyWeight = sc.nextDouble();
        return bodyWeight;
    }
    public double getBodyWeight(){
        return bodyWeight;
    }
}
