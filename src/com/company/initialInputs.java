package com.company;


public class initialInputs {
    public String name;
    public static double bodyWeight;
    public static double height;
    public static double age;


    public initialInputs(String name, double bodyWeight, double height, double age){
        super();
        this.name = name;
        this.bodyWeight = bodyWeight;
        this.height = height;
        this.age = age;

    }
    public String getName(){
        return name;
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
    public String setName(String name){
        return name = name;
    }
    public double setBodyWeight(double bodyWeight){
        return bodyWeight = bodyWeight;
    }

}


