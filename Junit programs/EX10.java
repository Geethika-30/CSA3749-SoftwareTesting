import java.util.Scanner;

public class EX10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        // Calculate and display square and cube
        System.out.println("Square: " + calculatePower(decimalNumber, 2));
        System.out.println("Cube: " + calculatePower(decimalNumber, 3));

        scanner.close();
    }

    // Function to calculate power (square, cube, etc.)
    public static double calculatePower(double number, int power) {
        return Math.pow(number, power);
    }
}
