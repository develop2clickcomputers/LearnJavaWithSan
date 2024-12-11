package com.dds.learn.java;

public class EntryFromKeyboard {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("You name is : " + name);
        System.out.print("How old are you? ");
        String age = scanner.nextLine();
        System.out.println("Hello "+name+". You are " + age + " years old.");
        scanner.close();
    }
    
}
