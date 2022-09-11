package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of monthly savings per month:");

        int amountOfMonthlySavings = scanner.nextInt();

        System.out.println("Enter the annual interest rate:");

        double annualRate = scanner.nextDouble();
        double monthRate = annualRate / 100 / 12;

        System.out.println("Enter the number of months:");

        int months = scanner.nextInt();
        double sum = 0.0;

        for(int i=0; i<months; i++){
            sum =+ amountOfMonthlySavings * (Math.pow((1+monthRate) ,months));
        }

        System.out.println("After the given number of months, the account balance is " + sum);
    }
}
