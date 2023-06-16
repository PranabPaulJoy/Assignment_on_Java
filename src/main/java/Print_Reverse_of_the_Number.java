//13. Take any number as input and print the reverse of the number
//        input: 12345
//        output: 54321

import java.util.Scanner;

public class Print_Reverse_of_the_Number {
    static int reVerse(int number) {
        int revarse = 0;
        int reminder;
        while (number != 0) {
            reminder = number % 10;
            revarse = revarse * 10 + reminder;
            number = number / 10;
        }
        return revarse;
    }

    public static void main(String args[]) {
        System.out.println("This program will take any number as input and print the reverse of the number.");
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        reVerse(number);

        System.out.println("\nIn Reverse Order\n" + reVerse(number));
    }
}
