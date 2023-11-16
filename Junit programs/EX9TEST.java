import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {

    @Test
    public void testIsLeapYear() {
        assertTrue(LeapYearChecker.isLeapYear(2000)); // Divisible by 4, 100, and 400
        assertTrue(LeapYearChecker.isLeapYear(2024)); // Divisible by 4, not by 100 but by 400
        assertFalse(LeapYearChecker.isLeapYear(1900)); // Divisible by 4 and 100, not by 400
        assertFalse(LeapYearChecker.isLeapYear(2022)); // Not divisible by 4

        // Add more test cases as needed
    }
}
