package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
    int numb = input();
    int a=0,b=1,c;
    for (int i = 2; true; ++i)
    {
        c = a + b;
        a = b;
        b = c;
        if(c==numb) {
            System.out.println("sequence number is "+i);
            break;
        }
        else if(c>numb){
            System.out.println("not a febo number");
            break;
        }
        else continue;
}}
    public static int input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter fibonacci index");
        return scanner.nextInt();
    }
}
