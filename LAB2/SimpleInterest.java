import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        float prinAmt = input.nextFloat();

        System.out.print("Enter Rate Amount: ");
        float raInt = input.nextFloat();

        System.out.print("Enter Time: ");
        float time = input.nextFloat();

        float amount = (prinAmt*raInt*time)/100;

        float finalAmount = amount+prinAmt;

        System.out.printf("Accrued Interest: %f \nFinal Amount: %f", amount, finalAmount);
    }
}