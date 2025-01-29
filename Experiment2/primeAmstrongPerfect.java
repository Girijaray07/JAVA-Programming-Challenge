import java.util.Scanner;

public class primeAmstrongPerfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        int sum = 0, temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum is: " + sum);
        boolean isPrime = true;
        if (sum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < sum; i++) { 
                if (sum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Prime: " + (isPrime ? "Y" : "N"));

        int armstrongSum = 0, armTemp = sum, digits = 0;

        temp = sum;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        while (armTemp > 0) {
            int digit = armTemp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit; 
            }
            armstrongSum += power;
            armTemp /= 10;
        }

        System.out.println("Armstrong: " + (armstrongSum == sum ? "Y" : "N"));

        int perfectSum = 0;
        for (int i = 1; i < sum; i++) { 
            if (sum % i == 0) {
                perfectSum += i;
            }
        }
        System.out.println("Perfect: " + (perfectSum == sum ? "Y" : "N"));

        scanner.close();
    }
}