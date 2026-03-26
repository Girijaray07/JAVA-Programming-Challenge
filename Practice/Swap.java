public class Swap {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;

        a = (b-a)+(b=a);
        System.out.println(a + " " +b);
    }
}
