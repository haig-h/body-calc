package com.company;


import java.util.Scanner;
/**This class is used to ask the user for inputs and store them until they are passed to the Bmr class to complete calculations.
 *@author Haig, Austin, Hunter, Jimmy, and  Jahan
 */
public class InitialInputs {
    private static String name;
    private static double bodyWeight;
    private static double height;
    private static double age;
    private static char gender;

    /**This method uses the 'this' keyword with the user inputs.
     */
    public InitialInputs(){
        super();
        this.name = name;
        this.bodyWeight = bodyWeight;
        this.height = height;
        this.age = age;
        this.gender = gender;

        /**
         * This method gets input for the user's name.
         */
    }
    public static String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = sc.nextLine();
        return name;

        /**
         * This method gets input for the user's weight.
         */
    }
    public static double getBodyWeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your body weight in pounds: ");
        bodyWeight = sc.nextDouble();
        return bodyWeight;

        /**
         * This method gets input for the user's height.
         */
    }
    public static double getHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your height in inches: ");
        height = sc.nextDouble();
        return height;
        /**
         * This method gets input for the user's age.
         */
    }
    public static double getAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = sc.nextDouble();
        return age;
        /**
         * This method gets input for the user's gender.
         */
    }
    public static char getGender(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter M if you are a Male, or F if you are Female: ");
        gender = sc.next().charAt(0);
        return gender;
        /**This is a set method for the input name
         */
    }
    public String setName(){
        return name = name;
        /**This is a set method for the input bodyWeight
         */
    }
    public static double setBodyWeight(){
        return bodyWeight = bodyWeight;
        /**This is a set method for the input height
         */
    }
    public static double setHeight(){
        return height = height;
        /**This is a set method for the input age
         */
    }
    public static double setAge(){
        return age = age;
    }
    /**This is a set method for the input gender
     */
    public static char setGender(){
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


