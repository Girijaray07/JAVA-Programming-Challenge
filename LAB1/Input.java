import java.util.Scanner;

public class Input {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a INT value: ");
        int num = input.nextInt();
        System.out.println("Value: " + num);

        System.out.print("Enter FLOAT Value: ");
        float num1 = input.nextFloat();
        System.out.println("Value: " + num1);

        input.nextLine();

        System.out.print("Enter STRING Value: ");
        String num2 = input.nextLine();
        System.out.println("Value: " + num2);

        System.out.print("Enter BOOLEAN Value: ");
        Boolean num3 = input.nextBoolean();
        System.out.println("Value: " + num3);

        input.close();
    }
}