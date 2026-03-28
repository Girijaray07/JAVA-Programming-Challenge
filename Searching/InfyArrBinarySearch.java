public class InfyArrBinarySearch {
    static int binary(int[] arr, int k, int low, int high) {
        while (low <= high) {
            int mid = (low+high)/2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }
    static int findingRange(int[] arr, int k) {
        //Starting with the box of size 2
        int start = 0;
        int nextStart = -1;
        int end = 1;

        System.out.println(start+" "+end);

        while (arr[end] < k) {
            nextStart = end+1;
            end = end + (end-start+1)*2;
            start = nextStart;
            System.out.println(start+" "+end);
        }

        return binary(arr, k, start, end);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9,10,12,13,14,15,17,18,19,21,23,25,27};
        int k = 25;
        int ans = findingRange(arr, k);
        System.out.println(ans);
    }
}
