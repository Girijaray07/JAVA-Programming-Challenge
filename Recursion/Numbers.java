package Recursion;

public class Numbers {
    public static void main(String[] args) {
        numbers(10, 1);
    }

    static void numbers(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println(i++);
        numbers(n, i);
    }
}
