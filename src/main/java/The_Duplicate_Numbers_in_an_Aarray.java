//14. Find out the duplicate numbers in the given array and in which position they are found.
//        numbers=[1,2,3,1,2,4,5,6,4]
//
//        Output:
//        Duplicate value: 1 at index 3
//        Duplicate value: 2 at index 4
//        Duplicate value: 4 at index 8

public class The_Duplicate_Numbers_in_an_Aarray {
    static void duplicateValue(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate value: " + numbers[i] + " at index " + j);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 1, 2, 4, 5, 6, 4};

        duplicateValue(numbers);

    }
}
