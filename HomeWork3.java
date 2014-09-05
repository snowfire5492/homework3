package homework3;

/* 
 * Chapter No. 3    Excercise No. 1
 * File Name: HomeWork2.java
 * @author: Eric Schenck
 * Date: September 2, 2012
 * 
 * 
 * Problem Statement: Write a program that ask the user to input a 
 * short message, and then will output that same message with the first 
 * word moved the the end of the sentence.
 * 
 * 
 *
 * Overall plan: not yet figured out
 * 1.) Change pounds of weight into kilograms
 * 2.) perform three seperate equations to figure out the amount of 
 * calories burned per minute for each activity.
 * 3.) Perform three seperate equations to multiply the amount of calories
 * burned per minute per activity by the amount of time stated in the problem
 * for each individual activity
 * 4.) add the three calorie amounts to calculate the total amount of 
 * calories burned.
 * 5.) print out a statement with the amount of calories burned.
 *
 * 
 */

import java.util.Scanner;


public class HomeWork3 {

    
    public static void main(String[] args) {
        
        
        System.out.println("Enter a line of text");
        
        Scanner keyboard = new Scanner(System.in);
        
        String wrd1, wrd2, wrd3, wrd4, wrd5, wrd6, wrd7;
        
        wrd1 = keyboard.next();
        
        wrd2 = keyboard.next();
        
        wrd3 = keyboard.next();
        
        wrd4 = keyboard.next();
        
        wrd5 = keyboard.next();
        
        
   System.out.println(wrd2 + " " + wrd3 + " " + wrd4 + " " + wrd5 + " " + wrd1);
    
    
    }
}
