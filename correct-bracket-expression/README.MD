# Correct Bracket Expressions Counter

This project calculates the number of **correct bracket expressions** (valid parentheses combinations) for a given number `N` of opening and closing brackets.

## Problem Description
A **correct bracket expression**:
1. Contains equal numbers of opening `(` and closing `)` brackets.
2. Ensures every opening bracket has a matching closing bracket, and no closing bracket appears before its matching opening bracket.

### Examples:
- For `N = 1`: One valid expression: `()`.
- For `N = 2`: Two valid expressions: `()()` and `(())`.
- For `N = 3`: Five valid expressions: `()()()`, `(()())`, `(())()`, `()(())`, and `((()))`.

The task is to compute the number of valid expressions for any non-negative integer `N`.

---

## Solution Explanation
The problem is solved using the **Catalan Number** formula:
\[
C_n = \frac{(2n)!}{(n+1)! \cdot n!}
\]

Where:
- \( (2n)! \): Factorial of \( 2n \),
- \( (n+1)! \): Factorial of \( n+1 \),
- \( n! \): Factorial of \( n \).

This formula efficiently computes the number of valid expressions for any given `N`.

---

## How It Works
The program performs the following steps:
1. Prompts the user to input `N` (number of pairs of brackets).
2. Validates that `N` is a non-negative integer.
3. Computes the \( n \)-th Catalan number using the factorial formula.
4. Outputs the result.

---

## Code

```java
import java.util.Scanner;

public class BracketExpressions {

    // Function to compute factorial of a number
    private static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i; // Multiply all integers from 1 to num
        }
        return result;
    }

    // Function to compute the nth Catalan number
    private static long catalanNumber(int n) {
        if (n == 0) {
            return 1; // Base case: 1 valid expression for N=0 (empty expression)
        }
        long numerator = factorial(2 * n); // (2n)!
        long denominator = factorial(n + 1) * factorial(n); // (n+1)! * n!
        return numerator / denominator; // Divide numerator by denominator
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (number of pairs of brackets): ");
        int n = scanner.nextInt(); // Input the number of pairs

        if (n < 0) {
            System.out.println("N should be a non-negative integer.");
        } else {
            // Compute the number of correct bracket expressions
            long result = catalanNumber(n);
            System.out.println("Number of correct bracket expressions: " + result);
        }
    }
}
