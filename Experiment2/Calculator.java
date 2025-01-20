import java.util.Scanner;

public class Calculator
{
    int calculate (int a, int b, char opcode) {
        switch (opcode) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Calculator obj = new Calculator();

        System.out.println("Welcome to Calculator!!");

        System.out.printf("Enter First Number: ");
        int a = input.nextInt();

        System.out.printf("Enter Second Number: ");
        int b = input.nextInt();

        System.out.printf("Enter Operation: ");
        char opcode = input.next().charAt(0);

        System.out.printf("\nResult: %d", obj.calculate(a, b, opcode));
    }
}