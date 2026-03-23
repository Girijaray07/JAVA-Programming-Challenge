public class ArrFloorBinary {
    public static int binarySearch (int[] arr, int n, int k) {
        int low = 0;
        int high = n-1;
        int ans = -1;

        while (low <= high) {
            int mid = (low+high)/2;

            if (arr[mid] <= k) {
                ans = arr[mid];
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int n = arr.length;
        int k = 4;

        System.out.println(binarySearch(arr, n, k));
    }
}
