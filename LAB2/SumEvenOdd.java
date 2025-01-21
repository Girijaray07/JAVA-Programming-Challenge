public class SumEvenOdd
{
    public static void main(String[] args)
    {
        int num = 1548;

        int org = num;
        int even = 0, odd = 0;
        while (org != 0) {
            int rem = num/10;
            if (rem % 2 == 0) {
                even += rem;
            } else {
                odd += rem;
            }
        }

        System.out.printf("Even: %d \nOdd: %d", even, odd);
    }
}