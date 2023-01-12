package com.bridgelabz.day2programs;

public class ReverseNumber {
    public static void main(String[] args) {


        int number = 23245; int rev = 0;

        while(number != 0)
        {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }

}
