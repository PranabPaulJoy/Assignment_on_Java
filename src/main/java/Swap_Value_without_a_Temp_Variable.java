//2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10

public class Swap_Value_without_a_Temp_Variable {
    public static void main(String[] args) {
        System.out.println("This program will swapping two values of variables without temp variable.");
        int a = 10;  //Initialize
        int b = 20;  //Initialize
        System.out.println("Initially a="+a+", b="+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping");
        System.out.println("a="+a+", b="+b);
    }
}
