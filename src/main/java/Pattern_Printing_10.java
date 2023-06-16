//10. Write a program that will give following output:
//        12345
//        2345
//        345
//        45
//        5

public class Pattern_Printing_10 {
    public static void main(String args[]) {
        int k=5;
        for(int i=0;i<=k-1;i++)
        {
            for(int j=i+1;j<=k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
