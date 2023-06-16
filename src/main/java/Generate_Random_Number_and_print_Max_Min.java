//6. Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array

public class Generate_Random_Number_and_print_Max_Min {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i=0;i<10;i++){
            array[i]=((int)(Math.random()*(100-1)+1));
        }
        for (int value : array) {
            System.out.print(value+" ");
        }
        System.out.println("\n");
        int max =array[0];
        int min = array[0];
        for (int i = 0;i<array.length;i++){
            if(array[i]>max)
            {
                max = array[i];
            }
            if(array[i]<min)
            {
                min = array[i];
            }
        }
        System.out.println("Max: "+max+"\nMin: "+min);
    }
}
