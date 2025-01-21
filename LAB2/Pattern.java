public class Pattern
{
    public static void main (String args[])
    {
        for (int i=1; i<=8; i++) {
            if (i%2 == 0) {
                for (int j=1; j<=i-1; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                System.out.println("*");
            }
        }

        System.out.println("\n");

        for (int i=5; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.printf("%c ",65+j);
            }
            System.out.print("\n");
        }

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.printf("%d ", i);
            }
            System.out.println("");
        }
    }
}