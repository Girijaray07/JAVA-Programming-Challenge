package Recursion;

public class CheckSortedArray { // Check if array is sorted
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9, 11, 15, 18 }; // Array to check
        int n = arr.length; // Length of the array

        System.out.println(checkSorted(arr, n, 1)); // Print the result
    }

    static boolean checkSorted(int[] arr, int n, int idx) { // Recursive function to check if array is sorted
        if (idx == n) { // Base case: If index reaches the end of the array
            return true; // Then the Array is Sorted
        }

        if (arr[idx - 1] > arr[idx]) { // Check if the previous element is greater than the current element
            return false; // Then the Array is not Sorted
        }
        return checkSorted(arr, n, ++idx);
    }
}
