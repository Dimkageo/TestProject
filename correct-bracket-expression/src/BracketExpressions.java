import java.util.Scanner;

public class BracketExpressions {

    // Function to calculate the nth Catalan number
    // The nth Catalan number represents the number of valid bracket expressions
    // with n pairs of brackets.
    private static long catalanNumber(int n) {
        // Array to store Catalan numbers up to n
        long[] catalan = new long[n + 1];

        // Base case: C0 = 1 (the number of valid expressions for 0 pairs of brackets)
        catalan[0] = 1;

        // Calculate each Catalan number using dynamic programming
        for (int i = 1; i <= n; i++) {
            catalan[i] = 0;
            // For each i, sum the products of previous Catalan numbers
            // This is based on the recursive formula for Catalan numbers:
            // Cn = Σ(Ci * Cn-1-i) for i from 0 to n-1
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }
        // Return the nth Catalan number
        return catalan[n];
    }

    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the value of N
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // Check if the input N is valid (N should be a non-negative integer)
        if (n < 0) {
            // If N is negative, print an error message
            System.out.println("N should be a non-negative integer.");
        } else {
            // Print the result: the number of valid bracket expressions
            System.out.println("Number of correct bracket expressions: " + catalanNumber(n));
        }
    }
}
