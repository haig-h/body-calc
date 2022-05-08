package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Body Calculator");
        char ans ='Y';
        do {
            initial();
            bmr();
            activity();
            System.out.println("Would you like to run again? \n Y for Yes N for No");
            ans = sc.next().charAt(0);
            ans = Character.toUpperCase(ans);
        }while(ans == 'Y');
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
    public static void activity(){
        Activity activitylvl = new Activity();
        activitylvl.activitymain();
    }
}
