//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//        Input: Civic
//        Output: true
//        Input: One
//        Output: false

import java.util.Scanner;

public class String_is_Palindrome_or_not {
    static void palindomOrNot(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindom = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindom = false;
            }
            start++;
            end--;
        }
        if (isPalindom) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        System.out.println("This  program is to Check if the given string is palindrome or not.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();

        palindomOrNot(str);     //Method calling
    }
}
