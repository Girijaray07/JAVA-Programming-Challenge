public class minimumProduct
{
    public static void main(String args[])
    {
        int num[] = {2, 10, 6, 3};
        int min = Integer.MAX_VALUE, min1 = Integer.MAX_VALUE;

        for (int i: num) {
            if (i < min) {
                min1 = min;
                min = i;
            } else {
                min1 = i;
            }
        }

        System.out.println("Product of Minimum Elements: "+min*min1);
    }
}