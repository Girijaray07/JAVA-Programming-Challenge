import java.util.Scanner;

public class AsciiPrint
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter any Character: ");
        char value = input.next().charAt(0);

        System.out.printf("Enter any Number: ");
        int num = input.nextInt();

        System.out.printf("\nAscii Value of %s and %d is:\n", value, num);
        System.out.printf("Character '%c' -> %d\n", value, (int) value);
        System.out.printf("Number %d -> %d\n", num, (int) num);

    }
}