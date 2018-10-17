/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Daniel J. Gallegos
 * 8/23/2018
 * 2013
 * cin#307398512
 *
 * 
 */
import java.util.*;
public class ComputeAndInterpretBMI {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter weight
        System.out.println("Enter weight in pounds");
        double weight = input.nextDouble();
        
        //prompt the user to enter height
        System.out.println("Enter height: input feet first, then press enter, then input the inches");
        double feet = input.nextDouble();
        double inches = input.nextDouble();
        double height = (feet*12) + inches;
        
        final double KILOGRAMS_PER_POUND = 0.45359237;//constant
        final double METERS_PER_INCH = 0.0254;// constant
                
        //Compute BMI
        
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        //Display result
        System.out.println("BMI is " + bmi);
        if(bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi < 25)
            System.out.println("Normal");
        else if(bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
    
}
