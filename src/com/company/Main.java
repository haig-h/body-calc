package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Body Calculator");
        initial();
        bmr();
    }
    public static void initial(){
        Scanner sc = new Scanner(System.in);
        InitialInputs inputs = new InitialInputs(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextInt());

        System.out.println("Your name is " + inputs.getName());
        System.out.println("Your weight is " + inputs.getBodyWeight());
        System.out.println("Your height is" + inputs.getHeight());
        System.out.println("Your age is " + inputs.getAge());
        System.out.println("Your gender is " + inputs.getGender());

    }
    public static void bmr(){
        Bmr bmr = new Bmr(InitialInputs.getBodyWeight(), InitialInputs.getHeight(),InitialInputs.getAge(),InitialInputs.getGender());
        bmr.main();
    }
}

