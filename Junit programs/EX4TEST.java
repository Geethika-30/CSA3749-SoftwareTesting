import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EX4Test {

    @Test
    public void testCalculateSimpleInterest() {
        // Test for a regular customer
        assertEquals(1000.0, SimpleInterestCalculator.calculateSimpleInterest(10000.0, 0.10, 1.0), 0.001);

        // Test for a senior citizen
        assertEquals(1200.0, SimpleInterestCalculator.calculateSimpleInterest(10000.0, 0.12, 1.0), 0.001);
    }
}
