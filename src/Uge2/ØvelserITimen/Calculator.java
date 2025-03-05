package Uge2.ØvelserITimen;

public class Calculator {
    public static void main(String[] args) {
        int result = add(10, 35);
        System.out.println(result);

        int result2 = sub(18, 30);
        System.out.println(result2);

        int result3 = mul(8, 9);
        System.out.println(result3);

        double result4 = div(4, 9);
        System.out.println(result4);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int c, int d) {
        return c - d;
    }
    public static int mul(int e, int f) {
        return e * f;
    }
    public static double div(double g, double h) {
        if (h == 0) {
            System.out.println("Fejl! Kan ikke dividere med 0!");
            return 0;
        }
        return g / h;
    }
}
