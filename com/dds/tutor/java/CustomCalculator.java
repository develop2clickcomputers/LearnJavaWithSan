package com.dds.tutor.java;
import java.util.Scanner;

public class CustomCalculator {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter only two arguments");
        System.out.println("Enter first arguments");
        String firstArguments = calc.nextLine(); 
        System.out.println("Enter second arguments");
        String secondArguments = calc.nextLine(); 
        System.out.println("Enter operation");
        String operation = calc.nextLine(); 
        if(operation.equals("+")){
           int output = Integer.valueOf(firstArguments)+Integer.valueOf(secondArguments);
           System.out.println("Output:"+output);
        } else {
            System.out.println("Operation not supported.");
        }
        calc.close();
    }
}
