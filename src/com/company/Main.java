package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Body Calculator");
        initial();
        bmr();

        System.out.println("What is your height?: ");
        int n = sc.nextInt();

        System.out.println("What is your weight?: ");
        int s = sc.nextInt();

        System.out.println("What is your body fat percentage?: ");

    }
    public static void initial(){
        Scanner sc = new Scanner(System.in);
        InitialInputs inputs = new InitialInputs(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextInt());
        inputs.main();

        System.out.println("What's your age? ");
    }
    public static void bmr(){
        Bmr bmr = new Bmr(InitialInputs.getBodyWeight(), InitialInputs.getHeight(),InitialInputs.getAge(),InitialInputs.getGender());
        bmr.main();



    }
}

