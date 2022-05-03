package com.company;


import java.util.Scanner;

public class InitialInputs {
    private static String name;
    private static double bodyWeight;
    private static double height;
    private static double age;
    private static int gender;


    public InitialInputs(){
        super();
        this.name = name;
        this.bodyWeight = bodyWeight;
        this.height = height;
        this.age = age;
        this.gender = gender;

    }
    public static String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = sc.nextLine();
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
    public void main(){
        System.out.println("Your name is " + name);
        System.out.println("Your weight is " + getBodyWeight());
        System.out.println("Your height is " + getHeight());
        System.out.println("Your age is " + getAge());
        System.out.println("Your gender is " + getGender());

    }
}


