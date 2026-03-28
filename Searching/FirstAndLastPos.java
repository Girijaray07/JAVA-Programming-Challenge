import java.util.*;

public class FirstAndLastPos {
    static int[] posBinary(int[] arr, int k) {
        int[] ans = {-1, -1};
        
        ans[0] = find(arr, k, true);
        ans[1] = find(arr, k, false);

        return ans;
    }

    static int find(int[] arr, int k, boolean first) {
        int left = 0;
        int right = arr.length-1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if (arr[mid] < k) {
                left = mid+1;
            } else if (arr[mid] > k) {
                right = mid-1;
            } else {
                //possible answer found
                ans = mid;
                
                if (first) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
        int[] arr1 = {5,7,7,7,8,8,10};
        int target1 = 7;

        int[] ans = posBinary(arr1, target1);
        System.out.println(Arrays.toString(ans));

        int[] arr2 = {5,7,7,88,10};
        int target2 = 6;

        int[] ans1 = posBinary(arr2, target2);
        System.out.println(Arrays.toString(ans1));
    }
}
