package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter 3 numbers:\n");
        int max=0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a > b && a > c)
            max= a;
        else if(b > a && b > c)
            max = b;
        else if(c > a && c > b)
            max = c;
        else
            System.out.println("No max");
        System.out.println("Max "+max);
} 
}
