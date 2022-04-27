package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Body Calculator");
        initial();
    }
    public static void initial(){
        Scanner sc = new Scanner(System.in);
        initialInputs inputs = new initialInputs(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextInt());

        inputs.getName();
        inputs.getBodyWeight();
        inputs.getHeight();
        inputs.getAge();
        inputs.getGender();

    }
}
