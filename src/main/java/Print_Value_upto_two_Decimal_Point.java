//3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52

public class Print_Value_upto_two_Decimal_Point {
    public static void main(String[] args) {

        double a = 15.5276;
        System.out.println("Given value: "+a);
        System.out.println("\nUpto 2 decimal point");
        System.out.printf("a=%.2f",a-0.01);
    }
}
