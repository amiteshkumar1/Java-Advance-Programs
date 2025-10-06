import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    // Iterative method using BigInteger
    public static BigInteger factorialIterative(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Recursive method using BigInteger
    public static BigInteger factorialRecursive(int n) {
        if (n == 0 || n == 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorialRecursive(n - 1));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }

            System.out.println("\nCalculating factorial of " + n + "...\n");

            BigInteger iterative = factorialIterative(n);
            BigInteger recursive = factorialRecursive(n);

            System.out.println("Factorial (Iterative): " + iterative);
            System.out.println("Factorial (Recursive): " + recursive);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
