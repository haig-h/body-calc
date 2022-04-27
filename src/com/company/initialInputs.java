package com.company;


public class initialInputs {
    public String name;
    public static double bodyWeight;
    public static double height;
    public static double age;
    public static int gender;


    public initialInputs(String name, double bodyWeight, double height, double age, int gender){
        super();
        this.name = name;
        this.bodyWeight = bodyWeight;
        this.height = height;
        this.age = age;
        this.gender = gender;

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

    public int getGender(){
        if(gender == 0){
            System.out.println("You are a male");
        }
        else if(gender == 1){
            System.out.println("You are female");
        }
        return gender;
    }
    public int setGender(){
        return gender = gender;
    }
}


