package Uge2.ØvelserITimen;

public class MathTest {
    public static void main(String[] args){
        // Øvelse 5 (metoder - built in functions)

        // a)
        double mathRandom = Math.random() * 10;
        System.out.println("random: " + mathRandom);

        // b)
        int mathAbs = Math.abs(10 + 9 + 1 + 17);
        System.out.println("abs: " + mathAbs);

        // c)
        double mathPow = Math.pow(39.9, 2);
        System.out.println("pow: " + mathPow);

        // d)
        double mathSqrt = Math.sqrt(27);
        System.out.println("sqrt: " + mathSqrt);

        // e)
        int mathMax = Math.max(492, 636);
        System.out.println("max: " + mathMax);

        // f)
        int mathMin = Math.min(172, 98);
        System.out.println("min: " + mathMin);

        // g)
        long mathRound = Math.round(20.887214748);
        System.out.println("round: " + mathRound);
    }

}
