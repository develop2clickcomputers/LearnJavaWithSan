package com.dds.tutor.java;
import java.util.Scanner;

public class GokulaKrishnan {
    public static void main(String[] args) {
        System.out.println("Hello Gokula Krishnan!!!");       
        System.out.println("How are you?");  
        System.out.println("How old are you?");

         /*
         * how to get input from key board ( customization )
         * 
         * Hello <yoname> -> Hello Gokul How are you ?
         * I am fine
         * How old are you ? -> <15> -> Hello Gokul, you are 15 years old
         * 
         */

        Scanner systemIn = new Scanner(System.in);
        System.out.println("Hello");
    
        String userName = systemIn.nextLine(); 
        System.out.println("You are : " + userName); 
        System.out.println("How old are you :");
        String userNameAge = systemIn.nextLine(); 
        System.out.println("Hello "+userName +", you are " + userNameAge +" years old.");
        systemIn.close();
       
    }
}
