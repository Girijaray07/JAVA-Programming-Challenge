import java.util.Scanner;

public class BinaryHexadecimal {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        System.out.print("Binary: ");
        int binary[] = new int[32];
        int index = 0;
        int temp = number;
        while (temp > 0) {
            binary[index++] = temp % 2;
            temp /= 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();

        System.out.print("Hexadecimal: ");
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', 
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char hex[] = new char[8];
        index = 0;
        temp = number;
        while (temp > 0) {
            hex[index++] = hexDigits[temp % 16];
            temp /= 16;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hex[i]);
        }
        System.out.println();

        scanner.close();
    }
}