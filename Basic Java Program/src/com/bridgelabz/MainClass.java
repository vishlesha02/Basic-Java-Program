package com.bridgelabz;

import java.util.Scanner;

public class MainClass {
   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        BasicJavaProgram program=new BasicJavaProgram();
        System.out.println("============= Welcome to basic java program! =============");

        System.out.println("Enter the Number to select the option");
        System.out.println("1) Flip Coin and print percentage of Heads and Tails");
        System.out.println("2) Leap Year");
        System.out.println("3) Even number");
        System.out.println("4) Vowel or Consonant");

        int option=sc.nextInt();
        switch (option){
            case 1:
                program.flipCoin();
                break;

            case 2:
                program.leapYear();
                break;

            case 3:
                program.evenOddNumber();
                break;

            case 4:
                program.vowelOrConsonant();
                break;

            default:
                System.out.println("You entered wrong option");
                break;
        }

    }
}
