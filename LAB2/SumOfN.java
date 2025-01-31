import java.util.Scanner;

public class SumOfN
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int num = input.nextInt();

        float sum = 1;

        System.out.print("Series: 1");
        for (int i=1; i<num; i++) {
            double ele = 0.5*i;
            System.out.print(" + 1/"+2*i);
            sum += ele;
        }

        System.out.printf("\nOutput: %.2f", sum);

        input.close();
    }
}