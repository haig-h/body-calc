package com.company;


public class initialInputs {
    private double bodyWeight;
    private double height;
    private double age;


    public initialInputs(double bodyWeight, double height, double age){
        this.bodyWeight = bodyWeight;
        this.height = height;
        this.age = age;

    }

    public double getBodyWeight(){
        System.out.println("Your body weight is " + bodyWeight);
        return bodyWeight;
    }
    public double getHeight(){
        System.out.println("Your height is " + height);
        return height;
    }
    public double getAge(){
        System.out.println("Your age is " + age);
        return age;
    }

}


