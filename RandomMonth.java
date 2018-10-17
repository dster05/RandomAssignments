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
public class RandomMonth{
    
    public static int random(){//creates random number
        int ran;
        ran = (int)(Math.random()*(12))+1;
        return ran;
    }
    
    public static void main(String[] args){
        int month;
        month = random();
        
        switch(month){//picks the month based on month value
            case 1: System.out.println("January");
                    break;
            case 2: System.out.println("Feburary");
                                break;
            case 3: System.out.println("March");
                                break;
            case 4: System.out.println("April");
                                break;
            case 5: System.out.println("May");
                                break;
            case 6: System.out.println("June");
                                break;
            case 7: System.out.println("July");
                                break;
            case 8: System.out.println("August");
                                break;
            case 9: System.out.println("September");
                                break;
            case 10: System.out.println("October");
                                break;
            case 11: System.out.println("November");
                                break;
            case 12: System.out.println("December");
                                break;
        }
    }
}
