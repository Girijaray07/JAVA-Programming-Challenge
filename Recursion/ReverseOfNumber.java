package Recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 1824;
        int n = (int) Math.log10(num) + 1;
        int ans = reverse(num, n);
        System.out.println(ans);
    }

    static int count(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + count(num / 10);
    }

    static int reverse(int num, int cnt) {
        if ((num % 10) == num) {
            return num;
        }
        int rem = (num % 10);
        return (rem * (int) Math.pow(10, cnt - 1) + reverse(num / 10, cnt - 1));
    }
}
