package Recursion;

public class Main {
    public static void main(String[] args) {
        message(0);
    }

    static void message(int i) {
        System.out.println("Hello World " + ++i);
        message(i);
    }
}
