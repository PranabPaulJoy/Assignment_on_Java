//7. Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the given array:
//        notes=[1000,500,200,100,50,20,10,5,2,1]
//        Example 1: User input: 575
//        Output:
//        500 1
//        50 1
//        20 1
//        5 1
//        Example 2: User input: 2148
//        Output:
//        1000 2
//        100 1
//        20 2
//        5 1
//        2 1
//        1 1

import java.util.Scanner;
public class Breakdown_the_Amount_by_Notes {
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            System.out.print("This program will breakdown the amount and count notes for any given amount.\n");
            System.out.print("Enter an amount: ");
            int amount = input.nextInt();

            if(amount>=1000){
                System.out.println("1000 "+amount/1000);
                amount = amount%1000;
            }
            if(amount>=500){
                System.out.println("500 "+amount/500);
                amount = amount%500;
            }
            if(amount>=200){
                System.out.println("200 "+amount/200);
                amount = amount%200;
            }
            if(amount>=100){
                System.out.println("100 "+amount/100);
                amount = amount%100;
            }
            if(amount>=50){
                System.out.println("50 "+amount/50);
                amount = amount%50;
            }
            if(amount>=20){
                System.out.println("20 "+amount/20);
                amount = amount%20;
            }
            if(amount>=10){
                System.out.println("10 "+amount/10);
                amount = amount%10;
            }
            if(amount>=5){
                System.out.println("5 "+amount/5);
                amount = amount%5;
            }
            if(amount>2){
                System.out.println("2 "+amount/2);
                amount = amount%2;
            }
            if(amount>=1){
                System.out.println("1 "+amount/1);
                amount = amount%1;
            }

        }
    }

