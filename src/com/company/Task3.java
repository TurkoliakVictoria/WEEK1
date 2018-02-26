package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

    System.out.println("number");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
   
    if(a%7==0)
        System.out.println("Double"+a*2);
    else 
        System.out.println("There is a rest"+a%7);

    }
}
