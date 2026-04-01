// https://leetcode.com/problems/find-in-mountain-array/

class SearchInMountain {
    static int PeakElement(int[] arr, int k) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right-left)/2;

            if (arr[mid+1] > arr[mid]) {
                left = mid+1;
            } else if (arr[mid-1] > arr[mid]) {
                right = mid-1;
            } else {
                return mid;
            }
        }
        return left;
    }

    static int binarySearch(int[] arr, int k, int left, int right) {

        while (left <= right) {
            int mid = (left+right)/2;

            System.out.printf("%d %d %d\n", left, right, mid);

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 2;

        int peak = PeakElement(arr, target);

        int first = binarySearch(arr, target, 0, peak);
        // if (first != -1) {
        //     return first;
        // }
        System.out.println();
        int second = binarySearch(arr, target, peak, arr.length);

        // System.out.printf("%d %d %d\n", peak, first, second);
    }
}