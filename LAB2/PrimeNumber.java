import java.util.Scanner;

public class PrimeNumber
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int noPrimes = 0;

        System.out.printf("Enter Lower Limit: ");
        int lowerLimit = input.nextInt();

        System.out.printf("Enter Upper Limit: ");
        int upperLimit = input.nextInt();

        System.out.printf("Enter Number Limit: ");
        int numberLimit = input.nextInt();

        if (upperLimit > lowerLimit) {
            for (int i=lowerLimit; i<=upperLimit; i++) {
                int count = 0;
                for (int j=1; j<=9; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count < 2) {
                    noPrimes += 1;
                }
            }
            if (numberLimit <= noPrimes) {
                for (int i=lowerLimit; i<=upperLimit; i++) {
                    int count = 0;
                    for (int j=1; j<=9; j++) {
                        if (i % j == 0) {
                            count += 1;
                        }
                    }
                    if (count < 2) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Limit Exceeded!!");
            }
        } else {
            System.out.println("Lower Limit is greater than Upper Limit");
        }
    }
}