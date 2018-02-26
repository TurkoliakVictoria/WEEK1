package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        int a= input();
        int count= 0;
        while (a > 0)
        {
            if( a %10==5)
                 count++;
            a=a/10;
        }
       System.out.println("Amount of 5= "+count);
    }

    public static int input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  number");
        return scanner.nextInt();
    }
}
