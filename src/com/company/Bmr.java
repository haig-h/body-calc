package com.company;

//import static com.company.InitialInputs.*;
//determines int for male/female

public class Bmr {
    private static double weight = InitialInputs.setBodyWeight();
    private static double height = InitialInputs.setHeight();
    private static double age = InitialInputs.setAge();
    private static char gender = InitialInputs.setGender();
    static double Bmr;

    public Bmr(double weight, double height, double age, char gender){
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    public Bmr() {
    }

    public static double getBmr(){
        switch(gender){
            case 'M','m':
                double BmrP1 = (6.23 * weight);
                double BmrP2 = (12.7 * height);
                double BmrP3 = (6.8 * age);
                double BmrP4 = BmrP1 + BmrP2;
                Bmr = BmrP4-BmrP3 + 66;

                break;
            case 'F','f':
                BmrP1 = (4.35 * weight);
                BmrP2 = (4.7 * height);
                BmrP3 = (4.7 * age);
                BmrP4 = BmrP1 + BmrP2;
                Bmr = BmrP4-BmrP3 + 655;

                break;
        }
        return Bmr;
    }


    public static void main(){
        System.out.println("Your bmr is: "+ getBmr());




    }
}
