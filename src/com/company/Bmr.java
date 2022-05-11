package com.company;

//import static com.company.InitialInputs.*;
//determines int for male/female

/**This class utilizes the inputs from the InitialInputs class and uses them to calculate BMR and print it out for the user.
 *@author Haig, Austin, Hunter, Jimmy, and  Jahan
 */
public class Bmr {
    private static double weight = InitialInputs.setBodyWeight();
    private static double height = InitialInputs.setHeight();
    private static double age = InitialInputs.setAge();
    private static char gender = InitialInputs.setGender();
    static double Bmr;

    /**This is a construtor with double, double, double, char parameters.
     *
     * @param weight
     * @param height
     * @param age
     * @param gender
     */
    public Bmr(double weight, double height, double age, char gender){
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    /**
     * This is an empty constructor.
     */
    public Bmr() {
    }

    /**This method uses the gender input to choose a calculation then uses the inputs for weight, height, and age to calculate base BMR.
     */
    public static double getBmr(){
        switch(gender){
            case 'M','m':
                double BmrP1 = (6.23 * weight);
                double BmrP2 = (12.7 * height);
                double BmrP3 = (6.8 * age);
                double BmrP4 = BmrP1 + BmrP2;
                Bmr = BmrP4-BmrP3 + 66;

                break;
            case 'F','f':
                BmrP1 = (4.35 * weight);
                BmrP2 = (4.7 * height);
                BmrP3 = (4.7 * age);
                BmrP4 = BmrP1 + BmrP2;
                Bmr = BmrP4-BmrP3 + 655;

                break;
        }
        return Bmr;
    }

    /**Main method for the BMR class, prints out the BMR that has been calculated.
     *
     */
    public static void main(){
        System.out.println("Your bmr is: "+ getBmr());




    }
}
