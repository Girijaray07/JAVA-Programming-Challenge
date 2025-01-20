/* WAP to swap two numbers using third variables and without using third variables. */

public class Swap
{
    int firstNum = 12;
    int secondNum = 14;
    public static void main (String args[])
    {
        Swap obj = new Swap();
        int a = obj.firstNum;
        int b = obj.secondNum;

        //swapping using third variable
        int c = a;
        a = b;
        b = c;
        System.out.printf("After Swapping using third variable: a=%d, b=%d\n", a, b);

        int d = obj.firstNum;
        int e = obj.secondNum;

        //swapping without third variable
        d = d+e;
        e = d-e;
        d = d-e;
        System.out.printf("After Swapping without using third variable: a=%d, b=%d\n", d, e);
    }
}