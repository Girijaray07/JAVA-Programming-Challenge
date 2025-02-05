import java.util.ArrayList;

public class SwiftZeros
{
    public static void main(String args[])
    {
        int input[] = {1, 1, 0, 2, 4, 7, 7, 4, 5, 0, 8, 0};
        long res = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        for (int x: input) {
            if (x != 0) {
                arr.add(x);
            } else {
                zeros.add(x);
            }
        }

        arr.addAll(zeros);

        for (int y=0; y<arr.size(); y++) {
            res = res*10 + arr.get(y);
        }

        System.out.println(res);
    }
}