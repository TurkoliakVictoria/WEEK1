package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){\
        
        int a=input();
        int b=input();

        if(a%10==b%10)
            System.out.println("The last numbers are the same ");
        else
            System.out.println("The last numbers are different");
    }

    public static int input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  number");
        return scanner.nextInt();
    }
}
