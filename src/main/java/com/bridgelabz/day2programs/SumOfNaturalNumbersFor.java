package com.bridgelabz.day2programs;

import java.util.Scanner;
import java.util.Scanner;

public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        int num, i, sum = 0;
//object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum from: ");
//takes an integer as input
        i = sc.nextInt();
        System.out.print("Sum up to: ");
//takes an integer as input
        num = sc.nextInt();
       for(i=0;i<=num;i++) {
//adding the value of i into sum variable
            sum = sum + i;
//increments the value of i by 1
        }
//prints the sum
        System.out.println("Sum of Natural Numbers = " + sum);
    }
}