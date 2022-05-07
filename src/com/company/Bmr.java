package com.company;

import static com.company.InitialInputs.*;
//determines int for male/female

public class Bmr {
    private static double weight = InitialInputs.setBodyWeight();
    private static double height = InitialInputs.setHeight();
    private static double age = InitialInputs.setAge();
    private static int gender = InitialInputs.setGender();

    public Bmr(double weight, double height, double age, int gender){
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    public Bmr() {
    }

    public static double getBmr(){
        if (gender == 1){
            double getBmrP1 = (6.23 * weight);
            double getBmrP2 = (12.7 * height);
            double getBmrP3 = (6.8 * age);
            double getBmrP4 = getBmrP1 + getBmrP2;
            double getBmr = getBmrP4-getBmrP3 + 66;
            return getBmr;
        }
        else{
            double getBmrP1 = (4.35 * weight);
            double getBmrP2 = (4.7 * height);
            double getBmrP3 = (4.7 * age);
            double getBmrP4 = getBmrP1 + getBmrP2;
            double getBmr = getBmrP4-getBmrP3 + 66;
            return getBmr;
        }
    }


    public static void main(){
        System.out.println("Your bmr is: " + getBmr());



    }
}
