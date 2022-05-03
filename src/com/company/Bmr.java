package com.company;

import static com.company.InitialInputs.*;
//determines int for male/female

public class Bmr {
    final static int SEX=0;
    private double weight;
    private double height;
    private double age;
    private static int gender;

    public Bmr(double weight, double height, double age, int gender){
        weight = InitialInputs.getBodyWeight();
        height = InitialInputs.getHeight();
        age = InitialInputs.getAge();
        gender = InitialInputs.getGender();
    }
    public static double getBmr(){
        if (gender == SEX){
            double getBmrP1 = (6.23 * getBodyWeight());
            double getBmrP2 = (12.7 * getHeight());
            double getBmrP3 = (6.8 * getAge());
            double getBmrP4 = getBmrP1 + getBmrP2;
            double getBmr = getBmrP4-getBmrP3 +66;
            return getBmr;
        }
        else{
            double getBmrP1 = (4.35 * getBodyWeight());
            double getBmrP2 = (4.7 * getHeight());
            double getBmrP3 = (4.7 * getAge());
            double getBmrP4 = getBmrP1 + getBmrP2;
            double getBmr = getBmrP4-getBmrP3 +66;
            return getBmr;
        }
    }

    public static void main(){
        System.out.println("Your bmr is " + getBmr());



    }
}
