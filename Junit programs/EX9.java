public class EX9 {

    public static void main(String[] args) {
        int year = 2024; // Replace 2024 with the desired year for testing
        boolean isLeap = isLeapYear(year);

        System.out.println(year + (isLeap ? " is" : " is not") + " a leap year.");
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
