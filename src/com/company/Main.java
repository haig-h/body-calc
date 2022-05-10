package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Body Calculator");
        char ans = 'Y';
        do {
            initial();
            bmr();
            activity();
            outputExcel();
            System.out.println("Would you like to run again? \n Y for Yes N for No");
            ans = sc.next().charAt(0);
            ans = Character.toUpperCase(ans);
        } while (ans == 'Y');
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

    public static void activity() {
        Activity activitylvl = new Activity();
        activitylvl.activitymain();
    }

    public static void outputExcel() throws Exception {
        OutputExcel outputExcel = new OutputExcel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to export your data to Excel?(Y for Yes / N for No)");
        char out = sc.next().charAt(0);
        if (out == 'Y'|| out == 'y'){
            outputExcel.main();
        } else{
            System.out.println("Nothing will be exported");
        }
    }
}