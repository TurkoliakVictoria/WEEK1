package com.company;

import java.util.Scanner;

public class Task4 {
            
     public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
     System.out.println(" enter a number");
     float number=  scanner.nextFloat();
            
     if(number>=0 && number<=1)
          System.out.println("it's between 0 and 1");
     else
          System.out.println("No");

}
}
