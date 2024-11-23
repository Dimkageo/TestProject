import java.util.Scanner;

public class BracketExpressions {
    // Function to calculate the nth Catalan number
    private static long catalanNumber(int n) {
        long[] catalan = new long[n + 1];
        catalan[0] = 1;
        for (int i = 1; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }
        return catalan[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("N should be a non-negative integer.");
        } else {
            System.out.println("Number of correct bracket expressions: " + catalanNumber(n));
        }
    }
}
