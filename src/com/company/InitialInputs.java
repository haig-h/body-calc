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
        System.out.print("Please enter your name: ");
        name = sc.nextLine();
        return name;
    }
    public static double getBodyWeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Body Weight: ");
        bodyWeight = sc.nextDouble();
        return bodyWeight;
    }
    public static double getHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Height in centimeters? or inches we need to choose: ");
        height = sc.nextDouble();
        return height;
    }
    public static double getAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = sc.nextDouble();
        return age;
    }
    public static int getGender(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1 if you are a male, or 2 if you are female: ");
        gender = sc.nextInt();
        return gender;
    }
    public String setName(){
        return name = name;
    }
    public static double setBodyWeight(){
        return bodyWeight = bodyWeight;
    }
    public static double setHeight(){
        return height = height;
    }
    public static double setAge(){
        return age = age;
    }
    public static int setGender(){
        return gender = gender;
    }
    public void main(){
        /*
        System.out.println("Your name is " + name);
        System.out.println("Your weight is " + getBodyWeight());
        System.out.println("Your height is " + getHeight());
        System.out.println("Your age is " + getAge());
        System.out.println("Your gender is " + getGender());
        */
    }
}


