public class ArrLinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,8,4,9,3,6,1,5};
        int k = 3;

        boolean found=false;
        int idx = -1;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == k) {
                idx = i;
                found=true;
                break;
            }
        }

        System.out.println(found+" "+idx);
    }
}
