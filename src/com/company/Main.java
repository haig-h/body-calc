/**This is the main class where all other classes are called to complete their function.
 * @author Haig, Austin, Hunter, Jimmy, and Yesiah
 * @version 1.0
 */
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

    /**This method calls the getName method from Class InitialInputs.
     * This method is called from the main method of the Main class
     */
    public static void initial() {
        Scanner sc = new Scanner(System.in);
        InitialInputs inputs = new InitialInputs();
        InitialInputs.getName();
        inputs.main();

    }

    /**This method calls the main method from the Bmr class and calculates Bmr and prints the result.
     *This is called in the main method of the Main class.
     */
    public static void bmr() {
        Bmr bmr = new Bmr(InitialInputs.getBodyWeight(), InitialInputs.getHeight(), InitialInputs.getAge(), InitialInputs.getGender());
        bmr.main();

/**This method calls the main method the Activity class which asks for user input indicating activity level, calculates an adjustment to BMR and prints out an adjusted number..
 *This method is called from the main method in the Main class.
 */
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