package com.company;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args){
        int a= input();
        int b= input();
        int sum= a+b;
        if(sum >=11 && sum <= 19)
            System.out.println("Sum is in the limits of 11 and 19 ");
        else 
            System.out.println("It is not lie in the boards of 11 and 19");
    }

    public static int input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  number");
        return scanner.nextInt();
    }
}
