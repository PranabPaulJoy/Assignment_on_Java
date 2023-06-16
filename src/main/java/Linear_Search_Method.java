//5. Write a program that will find your key is found in the given array using linear search method
//        numbers=[1,6,9,3,5,4,7] key=5

public class Linear_Search_Method {
    public static void main(String[] args) {
        int key = 5;
        int numbers[] = {1, 6, 9, 3, 5, 4, 7};
        boolean flag = true;

        System.out.print("Given Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("\n\nKey " + key + " is found at " + i + " index.");
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("\n\nKey " + key + " is not found.");
        }
    }
}
