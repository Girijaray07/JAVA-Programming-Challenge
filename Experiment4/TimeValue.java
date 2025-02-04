import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;

public class TimeValue
{
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    void addTime(ArrayList<Integer> list) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int min = time.getMinute();

        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(hour);
        temp.add(min);
        temp.addAll(list);
        
        arr.add(temp);
    }

    void display() {
        for (ArrayList<Integer> list : arr) {
            System.out.println(list);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TimeValue obj = new TimeValue();

        System.out.print("Enter Number of Stocks: ");
        int num = input.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i=0; i<num; i++) {
            System.out.printf("Enter value of %d Stock: ", i+1);
            int value = input.nextInt();

            arr1.add(value);
        }

        // System.out.println(arr1);
        obj.addTime(arr1);
        obj.display();


        input.close();
    }
}  