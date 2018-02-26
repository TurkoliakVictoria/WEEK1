package com.company;
import java.util.Scanner; // імпорт сканера
public class Task1{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println ("Enter time from 0 to 24 ");
            int time = scanner.nextInt();
            if(time>=0 && time<=24)
            {
                 if(time<9 || time>18)
                        System.out.println("I rest");
                 else if(time> 9 && time< 18)
                        System.out.println("I am at work");
            }
            else 
                System.out.println("Day has only 24 hours");
        }
    }

