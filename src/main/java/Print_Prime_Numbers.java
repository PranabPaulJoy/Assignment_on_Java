//8. Print the prime numbers of 2 to 100

public class Print_Prime_Numbers {
    public static void main(String args[]) {
        System.out.println("Print the prime numbers of 2 to 100.");
        int count = 0;
        for (int j = 2; j <= 100; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(j + " ");
            }
            count = 0;
        }
    }
}
