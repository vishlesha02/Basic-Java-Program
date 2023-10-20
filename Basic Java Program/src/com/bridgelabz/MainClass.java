package com.bridgelabz;

import java.util.Scanner;

public class MainClass {
   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        BasicJavaProgram program=new BasicJavaProgram();
        System.out.println("============= Welcome to basic java program! =============");

        System.out.println("Enter the Number to select the option");
        System.out.println("1) Flip Coin and print percentage of Heads and Tails");

        int option=sc.nextInt();
        switch (option){
            case 1:
                program.flipCoin();
                break;

            default:
                System.out.println("You entered wrong option");
                break;
        }

    }
}
