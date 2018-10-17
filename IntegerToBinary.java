/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dster
 */
import java.util.*;
public class IntegerToBinary{
    
    public static void intToBin(int x){
        int[] bin = new int[100];
        int remainder, quotient;
        int counter=0;
        for(int i=0; i<bin.length; i++){
        quotient = x/2;
        remainder = x%2;
        if(quotient == 0){
            break;
        }
        else{
            bin[i] = remainder;
            x = quotient;
            counter++;
        }
    }
   System.out.print("The is the binary number: ");
    for(int j = counter ; j>=0; j--){
        System.out.print(" " + bin[j]);
    }
}
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Please enter a positive integer");
        num = input.nextInt();
        intToBin(num);
       
    }
}
