package BitwisePractice;

public class FindRightMostSetBit {
    public static void main(String[] args) {
        int num = 10;
        int n = 0;
        int i = 0;

        while (num > 0) {
            n++;
            if ((num & 1) == 1) {
                i = n;
                break;
            }
            num = num >> 1;
        }

        System.out.println(i);
    }
}
