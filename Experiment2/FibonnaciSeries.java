import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        System.out.print("Fibonacci Series (Non-Recursive): ");
        int a = 0, b = 1, temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();

        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < n; i++) {
            int fib = 0;
            if (i == 0) {
                fib = 0;
            } else if (i == 1) {
                fib = 1;
            } else {
                int first = 0, second = 1;
                for (int j = 2; j <= i; j++) {
                    fib = first + second;
                    first = second;
                    second = fib;
                }
            }
            System.out.print(fib + " ");
        }
        System.out.println();
        scanner.close();
    }
}