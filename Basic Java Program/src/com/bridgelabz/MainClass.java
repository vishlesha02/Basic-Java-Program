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
        System.out.println("5) Find Largest among 3 numbers");
        System.out.println("6) Swap Two Numbers");
        System.out.println("7) Compute Quotient and Remainder");
        System.out.println("8) Power of Two");
        System.out.println("9) Harmonic Number");
        System.out.println("10) Prime Number Factorization");

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

            case 5:
                program.largestAmongThreeNumbers();
                break;
            case 6:
                program.swapTwoNumbers();
                break;
            case 7:
                program.computeQuotientAndRemainder();
                break;
            case 8:
                program.powerOfTwo();
                break;
            case 9:
                program.harmonicNumber();
                break;
            case 10:
                program.primeFactorization();
                break;
            default:
                System.out.println("You entered wrong option");
                break;
        }

    }
}
