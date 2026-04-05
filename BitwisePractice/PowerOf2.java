package BitwisePractice;

public class PowerOf2 { // Check a number if power of 2
    public static void main(String[] args) {
        int num = 8; // Number to check
        boolean ans = ((num > 0) && (num & (num - 1)) == 0); // Check if power of 2
        System.out.println(ans); // Print the result
    }
}
