package com.company;
import java.util.Scanner;
public class Activity extends Bmr{
    public static double getAdjusted(){
        return adjusted;
    }

    public Activity() {
        super();

    }
    public static void main(String[] args) {}
    private static double adjusted = 0;

    public double activitymain(){
               Scanner sc = new Scanner(System.in);
               System.out.println("Please indicate your level of activity. Press 1 for sedentary, 2 for lightly active ");
               System.out.println("3 for moderately active, 4 for very active, and 5 for extra active.");
               int activityChoice = sc.nextInt();
               double adjusted = 0;
               double a = 0;
               switch (activityChoice) {
                   case 1:
                       a = 1.2;
                       adjusted = a * getBmr();
                       System.out.println("Your activity adjusted BMR is "+ adjusted);
                       break;
                   case 2:
                       a = 1.375;
                       adjusted = a * getBmr();
                       System.out.println("Your activity adjusted BMR is "+ adjusted);
                       break;
                   case 3:
                       a = 1.55;
                       adjusted = a * getBmr();
                       System.out.println("Your activity adjusted BMR is "+ adjusted);
                       break;
                   case 4:
                       a = 1.725;
                       adjusted = a * getBmr();
                       System.out.println("Your activity adjusted BMR is "+ adjusted);
                       break;
                   case 5:
                       a = 1.9;
                       adjusted = a * getBmr();
                       System.out.println("Your activity adjusted BMR is "+ adjusted);
                       break;
               }

            return adjusted;

        }

}

