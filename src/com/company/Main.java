package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Body Calculator");
        initial();
        bmr();
    }

    public static void initial() {
        Scanner sc = new Scanner(System.in);
        InitialInputs inputs = new InitialInputs();
        InitialInputs.getName();
        inputs.main();

    }

    public static void bmr() {
        Bmr bmr = new Bmr(InitialInputs.getBodyWeight(), InitialInputs.getHeight(), InitialInputs.getAge(), InitialInputs.getGender());
        bmr.main();


    }
}
