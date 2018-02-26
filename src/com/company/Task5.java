package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)
    {
    int a=input();
    int b=input();
    if(a>b)
        System.out.println("a is bigger,so result is "+ (a-b));
    else if(b>a)
        System.out.println("b is bigger,so result is "+ (a*b));
    else System.out.println("a=b");
    }

    public static int input () {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter  number");
     return scanner.nextInt();
    }
}