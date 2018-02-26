package com.company;

import java.util.Scanner;

public class Task10 { public static void main(String[] args)
{  System.out.println("Enter 1 or 2 :1-Into binary system,2-into decimal system");
    int c=input();
    if(c==1){
    int a=input();
    String x = "";
    while(a > 0)
    {
        int b= a % 2;
        x = b + x;
        a = a / 2;
    }
    System.out.println("In binary system = "+x);}
    else if(c==2){

        System.out.print("Enter Binary Number : ");
        int bin=input();
        int dec=0;
        int i=1;
        // converting the number into decimal format
        while(bin != 0)
        {
            dec = dec + (bin%10)*i;
            i = i*2;
            bin = bin/10;
        }

        System.out.print("Equivalent Decimal Value of number is :\n"+dec);


    }
}

    public static int input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  number");
        return scanner.nextInt();
}}
