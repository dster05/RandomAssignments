/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Daniel J. Gallegos
 * 8/28/2018
 * 2013
 * 
 * 
 */
import java.util.*;
public class DisplayLengthandFirst{
    
    public static void lengthAndFirst(String x){//takes string and changes it to char array then prints result
        char[] word = x.toCharArray();
       
        System.out.print("The first character is: " + word[0] + " and the words length is: " + word.length);
        
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Please enter a single word: ");//prompts user for word
        word = input.next();
        lengthAndFirst(word);//calls lengthAndFirst Method
        
        
        
    }
    
}
