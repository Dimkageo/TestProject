import java.math.BigInteger;

public class FactorialSum {
    public static void main(String[] args) {
        // Calculate 100!
        BigInteger factorial = calculateFactorial(100);
        
        // Find the sum of the digits of 100!
        int sum = sumOfDigits(factorial);
        
        // Output the result
        System.out.println(sum);
    }
    
    // Method to calculate the factorial
    public static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // Multiply by i
        }
        return factorial;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        // Convert the number to a string
        String numberStr = number.toString();
        
        // Loop through each digit and sum them
        for (int i = 0; i < numberStr.length(); i++) {
            sum += numberStr.charAt(i) - '0'; // Convert the character to a digit
        }
        return sum;
    }
}
