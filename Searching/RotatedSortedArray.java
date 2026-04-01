public class RotatedSortedArray {
    static int pivotElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        if (arr[left] <= arr[right]) return 0;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    static int binarySearch(int[] arr, int k, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return mid;
            }
            else if (arr[mid] > k) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = pivotElement(nums);

        if (pivot == 0) {
            System.out.println(binarySearch(nums, target, 0, nums.length - 1));
        }

        if (target >= nums[0]) {
            System.out.println(binarySearch(nums, target, 0, pivot - 1));
        } else {
            System.out.println(binarySearch(nums, target, pivot, nums.length - 1));
        }
    }
}