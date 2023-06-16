// 1. Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10

public class Swap_Value_using_a_Temp_Variable {
    public static void main(String[] args) {
        System.out.println("This program will swapping two values of variables with temp variable.");

        int a = 10;   //Initialize
        int b = 20;   //Initialize
        int temp;
        System.out.println("Initially a="+a+", b="+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.println("a="+a+", b="+b);
    }
}