package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String args[]){
        int fact=1;
        int number=input();
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public static int input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  number");
        return scanner.nextInt();
    }


}
