public class Multiply
{
    void multiply(int a, int b) {
        System.out.printf("The product of %d and %d is: %d", a, b, a*b);
    }

    void multiply(int a, int b, int c) {
        System.out.printf("The product of %d, %d and %d is: %d", a, b, c, a*b*c);
    }

    void multiply(int arr[]) {
        int res = 1;
        for(int num: arr) {
            res *= num;
        }
        System.out.printf("The Multiple of the numbers is: %d", res);
    }

    public static void main(String[] args)
    {
        Multiply obj = new Multiply();
        obj.multiply(2, 3);

        System.out.println();
        obj.multiply(2, 3, 4); 

        System.out.println();
        int arr[] = {2, 3, 4, 5};
        obj.multiply(arr); 
    }
}