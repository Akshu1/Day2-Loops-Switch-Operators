package com.bridgelabz.day2programs;

import java.util.Scanner;
public class NumberToWord2 {
    public static void main(String[] args) {
        int i =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scan.nextInt();
        if(number==1){
            System.out.println("One");
        }
        else if(number==10) {
            System.out.println("Ten");
        }else if(number==100) {
            System.out.println("Hundred");
        }else if(number==1000) {
            System.out.println("One Thousand");
        }
    }


}
