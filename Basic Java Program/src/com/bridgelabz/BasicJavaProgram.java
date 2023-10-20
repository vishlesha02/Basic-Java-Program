package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class BasicJavaProgram {
    Scanner sc=new Scanner(System.in);
    public void flipCoin()
    {
        int countOfHeads=0;
        int countOfTails=0;
        System.out.println("Enter the number to flip the coin");
        int numOfFlip=sc.nextInt();

        Random random=new Random();

        for(int i=0;i<numOfFlip;i++) {
            double Coin = random.nextDouble();

            if (Coin < 0.5) {
                System.out.println("Tails");
                countOfTails++;
            } else {
                System.out.println("Heads");
                countOfHeads++;
            }
        }

        double h=(double)countOfHeads / numOfFlip*100;
        double t=(double)countOfTails / numOfFlip*100;

        System.out.println("Number of Heads : " + countOfHeads);
        System.out.println("Number of Tails : " + countOfTails);
        System.out.println("Percentage of Head : " + h + " %");
        System.out.println("Percentage of Tails : " + t + " %");
    }

    public void leapYear() {
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year > 999 && year < 10000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
        else {
            System.out.println("You enter valid 4-digit number!");
        }
    }

}
