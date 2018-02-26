package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int index = input();
        int a=0,b=1;
        int c=a+b;
        if(index==0||index==1)
            System.out.println(1);
         else
                for (int i = 2; i <= index; ++i)
                {
                    c = a + b;
                    a=b;
                    b=c;
                }
                System.out.println(c);
        }
        public static int input () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter fibonacci index");
            return scanner.nextInt();
        }

    }
