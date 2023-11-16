import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Input must be a non-negative integer.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }

    // Function to calculate factorial of a number
    public static long calculateFactorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * calculateFactorial(n - 1);
    }
}
