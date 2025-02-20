import java.util.Scanner;

public class Multiply {
    void multiply(int a, int b) {
        System.out.printf("Multiple of %d and %d is: %d\n", a, b, a * b);
    }

    void multiply(int a, int b, int c) {
        System.out.printf("Multiple of %d, %d and %d is: %d\n", a, b, c, a * b * c);
    }

    void multiply(int arr[]) {
        int res = 1;
        for (int num : arr) {
            res *= num;
        }
        System.out.printf("Result: %d\n", res);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[50];
        int size = 0;

        while (true) {
            System.out.print("Enter numbers (Press * to stop): ");
            if (input.hasNextInt()) {
                numbers[size] = input.nextInt();
                size++;
            } else {
                String store = input.next();
                if (store.equals("*")) {
                    break;
                }
            }
        }
        input.close();

        Multiply obj = new Multiply();
        int[] finalNumbers = new int[size];
        System.arraycopy(numbers, 0, finalNumbers, 0, size);

        if (size == 2) {
            obj.multiply(finalNumbers[0], finalNumbers[1]);
        } else if (size == 3) {
            obj.multiply(finalNumbers[0], finalNumbers[1], finalNumbers[2]);
        } else {
            obj.multiply(finalNumbers);
        }
    }
}