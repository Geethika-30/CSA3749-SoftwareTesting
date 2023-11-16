import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EX8TEST{

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(3628800, FactorialCalculator.calculateFactorial(10));

        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
        // Add more test cases as needed
    }
}
                                                                    
