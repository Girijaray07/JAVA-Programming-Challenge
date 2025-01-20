/* WAP to display the use of arithmetic, logical and relational operators on two 
variables.*/

public class Operators
{
    int sumNum1 = 19;
    int sumNum2 = 8;

    boolean isStudying = true;
    boolean isplaying = false;
    public static void main (String args[])
    {
        Operators obj = new Operators();

        int a = obj.sumNum1;
        int b = obj.sumNum2;
        System.out.println("\nArithematic Operators:");
        System.out.printf("Sum is: %d \nSub is: %d \nMultiple is: %d \nDivisior is: %d\n", a+b,a-b,a*b,a/b);
        

        boolean c = obj.isStudying;
        boolean d = obj.isplaying;
        System.out.println("\nLogical Operators:");
        System.out.printf("%b & %b is: %b\n",c, d, c&&d);
        System.out.printf("%b | %b is: %b\n",c, d, c||d);


        System.out.println("\nRelational Operators:");
        System.out.printf("%d == %d is: %b\n",a, b, a==b);
        System.out.printf("%d != %d is: %b\n",a, b, a!=b);
        System.out.printf("%d < %d is: %b\n",a, b, a<b);
        System.out.printf("%d > %d is: %b\n",a, b, a>b);
    }
}