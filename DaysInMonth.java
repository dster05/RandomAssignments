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
public class DaysInMonth {
    
    public static void numOfDay(int year, int month){
        String[] months = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] numDays= {29, 30, 31};
        boolean isLeapYear;
        
        if(isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400  == 0))//finds out if leap year
            System.out.println(months[month-1] +" "+ year + " had " + "29 days");
            else if((month)% 2 != 0)
                System.out.println(months[month-1] +" "+ year + " had "+"31 days");
                else
                System.out.println(months[month-1] +" "+ year + " had " +"30 days");
        
    }
    
    public static void main(String[] args){
        String[] months = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] numberOfMonths = {1,2,3,4,5,6,7,8,9,10,11,12};
        int month, year;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Integer number that represents the Month of the year: ");
        for(int i = 0; i <12; i++){
            System.out.println("Months " + months[i]+ "   " + numberOfMonths[i]);
        }
        System.out.print("enter here: ");
        month = input.nextInt();
        System.out.print("Please enter the year: ");
        year = input.nextInt();
        numOfDay(year, month);
        
    }
    
}
