import java.util.ArrayList;

public class ArrBinarySearch {
    static int binarySearch(int[] arr, int n, int k) {
        int low=0;
        int high = n;

        while (low < high) {
            int mid = (low + high)/2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,9,12,13,15};
        int k = 6;

        int ans = binarySearch(arr, arr.length, k);
        System.out.println(ans);
    }
}