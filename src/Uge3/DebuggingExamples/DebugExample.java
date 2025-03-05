package Uge3.DebuggingExamples;
public class DebugExample {
    public static void main(String[] args) {
        first();
        third();
        second();
    }

    public static void first() {
        System.out.println("Inside first method");
    }

    public static void second() {
        System.out.println("Inside second method");
        first();
    }

    public static void third() {
        System.out.println("Inside third method");
        first();
        second();
    }
}