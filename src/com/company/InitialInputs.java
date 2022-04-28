package com.company;


public class InitialInputs {
    private String name;
    private static double bodyWeight;
    private static double height;
    private static double age;
    private static int gender;


    public InitialInputs(String name, double bodyWeight, double height, double age, int gender){
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
    public static double getBodyWeight(){
        return bodyWeight;
    }
    public static double getHeight(){
        return height;
    }
    public static double getAge(){
        return age;
    }
    public String setName(String name){
        return name = name;
    }
    public double setBodyWeight(double bodyWeight){
        return bodyWeight = bodyWeight;
    }

    public static int getGender(){

        return gender;
    }
    public int setGender(){
        return gender = gender;
    }
}


