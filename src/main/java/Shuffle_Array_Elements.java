//12. Write a program that will shuffle (values will randomly change their position)
// from the given array numbers=[1,2,3,4,5,6,7,8,9,0]
// random output: 3 5 0 1 7 9 6 4 2 8

public class Shuffle_Array_Elements {
    static void shuffleArrayElements(int numbers[], int length) {
        for (int i = 0; i < length; i++) {
            int s = i + (int) (Math.random() * (length - i));
            int temp = numbers[s];
            numbers[s] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print("Given array: ");
        for(int elements : numbers) {
            System.out.print(elements+" ");
        }
        int length = numbers.length;

        shuffleArrayElements(numbers, length);
// MyClass.shuffleArrayElements(numbers, length);
        System.out.println("\n\nAfter Shuffling");
        for (int elements : numbers) {
            System.out.print(elements + " ");
        }
    }
}
