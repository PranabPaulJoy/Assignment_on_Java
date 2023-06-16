//11. Find out the second largest element of the given array numbers=[5,3,9,7,4,1,8]

public class The_Second_Largest_Element {
    static int secondLargest(int numbers[]) {
        int first_max = 0;
        int second_max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > first_max) {
                first_max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < first_max && numbers[i] > second_max) {
                second_max = numbers[i];
            }
        }
        return second_max;
    }

    public static void main(String args[]) {
        System.out.println("This program will find out the second largest element of the given array.\n");
        int numbers[] = {5, 3, 9, 7, 4, 1, 8};
        System.out.print("Given array: ");
        for(int elements : numbers) {
            System.out.print(elements+" ");
        }
        secondLargest(numbers);
        System.out.println("\nThe second largest element: " + secondLargest(numbers));
    }
}
