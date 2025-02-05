import java.util.ArrayList;

public class ElementFrequency
{
    public static void main(String args[])
    {
        int arr[] = { 2, 2, 3, 3, 4, 4, 5, 5, 2, 2, 9, 9, 2, 0, 6, 1, 4, 9};

        ArrayList<Integer> pickedArr = new ArrayList<>();
        ArrayList<Integer> pickCount = new ArrayList<>();

        for (int x : arr) {
            if (!(pickedArr.contains(x))) {
                pickedArr.add(x);
                pickCount.add(1);
            } else {
                int i = pickedArr.indexOf(x);
                pickCount.set(i, pickCount.get(i) + 1);
            }
        }

        System.out.println(pickedArr);
        System.err.println(pickCount);
    }
}