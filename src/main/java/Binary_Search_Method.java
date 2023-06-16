//4. Write a program that will find your key is found in the given array using binary search method
//        numbers=[1,6,9,3,5,4,7]

import java.util.Arrays;

public class Binary_Search_Method {
    public static void main(String[] args) {

        int key = 5;
        int numbers[] = {1, 6, 9, 3, 5, 4, 7};

        System.out.print("Given Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        Arrays.sort(numbers);
        System.out.println();
        System.out.print("Sort Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nKey: " + key);
        System.out.println();

        int low = 0;
        int high = numbers.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (numbers[mid] > key) {
                high = mid - 1;
            } else if (numbers[mid] == key) {
                System.out.println("Key " + key + " is found at " + mid + " index.");
                break;
            } else {
                low = mid + 1;
                mid = (low + high) / 2;
            }

            if (low > high) {
                System.out.println("Key " + key + " is not found");
                break;
            }
        }
    }
}


