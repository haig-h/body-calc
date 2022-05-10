/**This class asks for user input to indicate activity level then prints out an adjusted BMR.
 **@author Haig, Austin, Hunter, Jimmy, and Yesiah
 */
package com.company;
import java.util.Scanner;
public class Activity extends Bmr{
    public Activity() {
        super();
    }

    /**This is the main method of the Activity class that collects the inputs and prints out an adjusted BMR.
     * this class is an example of inheritance and extends Bmr.
     * @param args
     */
    public static void main(String[] args) {}
        public void activitymain(){
               Scanner sc = new Scanner(System.in);
               System.out.println("Please indicate your level of activity. Press 1 for sedentary, 2 for lightly active ");
               System.out.println("3 for moderately active, 4 for very active, and 5 for extra active.");
               int activityChoice = sc.nextInt();
               switch (activityChoice) {
                   case 1:
                       System.out.println("Your activity adjusted BMR is "+ 1.2 * getBmr());
                       break;
                   case 2:
                       System.out.println("Your activity adjusted BMR is "+ 1.375 * getBmr());
                       break;
                   case 3:
                       System.out.println("Your activity adjusted BMR is "+ 1.55 * getBmr());
                       break;
                   case 4:
                       System.out.println("Your activity adjusted BMR is "+ 1.725 * getBmr());
                       break;
                   case 5:
                       System.out.println("Your activity adjusted BMR is "+ 1.9 * getBmr());
                       break;
               }
    }
}

