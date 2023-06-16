//18. Write a program that will take integer numbers as user input continuously and
//      print the sum of numbers until user input q from the keyboard.
//      When user input q, program will be quit. If user inputs another character,
//      then the program will ask to input the number again.

import java.util.Scanner;

public class Input_Continuously_and_Print_the_Sum {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        char ch;
        System.out.println("Enter a number");
        do {
            sum += input.nextInt();
            System.out.println(sum);
            System.out.println("To continue press any key. To quit press q.");
            ch = input.next().charAt(0);
            if (ch != 'q') {
                System.out.println("Enter a number again");
            }
        }
        while (ch != 'q');

    }
}
