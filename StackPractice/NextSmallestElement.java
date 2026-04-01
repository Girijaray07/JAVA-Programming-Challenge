import java.util.*;

public class NextSmallestElement {
    int[] solve (int[]arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] arr2 = new int[n];

        for (int j=0; j<n; j++) {
            arr2[j] = -1;
        }

        for (int i=0; i<n; i++){
            while (!(st.isEmpty()) && arr[st.peek()] > arr[i]) {
                arr2[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return arr2;
    }

    int[] solve1 (int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] arr2 = new int[n];

        for (int j=0; j<n; j++) {
            arr2[j] = -1;
        }

        for (int i=n-1; i>=0; i--){
            while (!(st.isEmpty()) && arr[st.peek()] > arr[i]) {
                arr2[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return arr2;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] arr = {10, 18, 12, 20, 7, 4, 2, 15};

        NextSmallestElement obj = new NextSmallestElement();
        int[] arr1 = obj.solve1(arr, n);

        for (int i=0; i<n; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}