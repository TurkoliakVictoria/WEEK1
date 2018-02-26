package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double a= input();
        double b= input();
        if(a%b==0)
            System.out.println("True and result is a/b="+ (a/b));
        else
            System.out.println("False and result is a/b="+(a/b));
 }

    public static double input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        return scanner.nextDouble();
    }
}

