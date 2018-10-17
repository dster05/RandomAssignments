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

public class NumPalindrome {
    
    public static void isPalindrome(int x){//checks to see if Palindrome
    int[]pali = new int[3];//holds values
    int[]temp = new int[3];//holds values in opppsite direction
    int remainder = x;//holds remainder
    int i = 2;
    int z =2;
        while(remainder > 0){
            pali[i--] = remainder % 10;//uses modulo to seperate three digits
            remainder/=10;
        }
        for(int j =0; j<pali.length; j++){//reveres three digits
        temp[j] = pali[z--];
        }
        for(int n =0; n<pali.length; n++){//prints out numbers
            System.out.println(pali[n]+"  "+temp[n]);
         
            
        }
        int check =0;
        int check1 = 0;
        int counter = 0;
        boolean flag =false;
        
        while(counter < 3){//checks to see if matches
        if(pali[check++] == temp[check1++]){
            flag = true;
            counter++;
        }
        else{ 
            System.out.println("not a palindrome");
            break;
        }
        }
        if(flag == true)
            System.out.println("Its a palindrome yay");
         
    }
    
    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a three digit Integer: ");
        x = input.nextInt();
        isPalindrome(x);
    }
    
}
