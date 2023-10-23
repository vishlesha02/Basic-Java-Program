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

    public void evenOddNumber() {
        System.out.println("Enter the number");
        int num = sc.nextInt();
            if (num % 2 == 0)
            {
                System.out.println(num + " is even number");
            }
        else
            {
                System.out.println(num + " is odd number");
            }
    }

    public void vowelOrConsonant()
    {

        char a = 0,e = 0,i = 0,o = 0,u = 0;

        System.out.println("Enter the alphabet");
        char letter = sc.next().charAt(0);

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        {
            System.out.println(letter + " is a vowel");
        }
        else {
            System.out.println(letter + " is a consonant");
        }
    }

    public void largestAmongThreeNumbers()
    {
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();

        int largestNumber;
        if(a>b && a>c)
        {
            largestNumber=a;
        }
        else if(b>c)
        {
            largestNumber=b;
        }
        else
        {
            largestNumber=c;
        }
        System.out.println("Largest Number : " + largestNumber);

    }

    public void swapTwoNumbers()
    {
        int temp;
        System.out.println("Enter 1st number");
        int a=sc.nextInt();

        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Before swap a = " + a);
        System.out.println("Before swap b = " + b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("After swap a = " + a);
        System.out.println("After swap b = " + b);


    }

    public void computeQuotientAndRemainder()
    {
        System.out.println("Enter the Divident");
        int divident = sc.nextInt();

        System.out.println("Enter the Divisor");
        int divisor = sc.nextInt();

        int q = divident / divisor;
        int r = divident % divisor;

        System.out.println("Quotient : " + q);
        System.out.println("Remainder : " + r);

    }

    public void powerOfTwo()
    {
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        if (n < 32)
        {
            for (int i = 1; i < n; i++)
            {
                System.out.println((int)Math.pow(2,i));
            }

        }
        else {

            System.out.println("Enter valid Number");
        }
    }

    public void harmonicNumber()
    {
        double result = 0.0;

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        System.out.println("Harmonic of given Number is : ");

            for (int i = 1; i <= n; i++) {
                result += 1.0 / i;
                System.out.println(result + " , ");
            }
    }

    public void primeFactorization() {
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        int count = 0;

        System.out.println("The prime Factors of " + n + " are : ");

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                count++;
                System.out.println(i);
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }

}
