package BitwisePractice;

public class PowerOfAToB { // Find power of A to B using bitwise operators
    public static void main(String[] args) {
        int a = 3; // Base Number
        int b = 6; // Power Number

        // we can represent 3^6 to 3^(2+4) as power of 2, so now 3^(110)
        // Import to understand this question

        int ans = 1; // Variable to store the result while iterating

        while (b > 0) {
            if ((b & 1) == 1) { // Check if the last bit of b is 1
                ans *= a; // Multiply the result with a
            }
            a *= a; // Square the base
            b >>= 1; // Right shift b by 1
        }
        System.out.println(ans); // Print the result
    }
}
