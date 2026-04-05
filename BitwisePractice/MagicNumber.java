package BitwisePractice;

public class MagicNumber { // Find magic number using bitwise operators
    public static void main(String[] args) {
        int number = 10; // Number to find the magic number of
        int cnt = 0; // Counter for the number of bits
        int ans = 0; // Variable to store the result while iterating
        int base = 5; // Base for the magic number

        while (number > 0) { // Loop until the number becomes 0
            cnt++; // Increment the counter
            int last = number & 1; // Get the last bit of the number
            ans += last * base; // Add the last bit to the result
            base = base * 5; // Multiply the base by 5
            number = number >> 1; // Right shift the number by 1
        }

        System.out.println(ans + " " + cnt); // Print the result
    }
}
