/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Daniel J. Gallegos
 * 8/28/2018
 * 2013
 *
 * 
 */
import java.util.*;
public class ChecksVowelOrCon{
    
    public static void checkVowCon(char x){//checks to see if the letter is a vowel or consonant then prints result
        int letter = (int)x;
        if(letter == 97 || letter == 101 || letter == 105 || letter == 111 ||letter == 117){
            System.out.println("this letter is a Vowel");
        }
        else
            System.out.println("This letter is a Consonant");
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char a;
        System.out.println("Please enter a single letter");//prompts user for input
        a = input.next().charAt(0);
        checkVowCon(a);//calls checkVowCon method
    }
    
}
