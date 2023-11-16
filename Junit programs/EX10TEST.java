import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EX10TEST{

    @Test
    public void testCalculatePower() {
        assertEquals(4.0, SquareCubeCalculator.calculatePower(2.0, 2), 0.001);
        assertEquals(25.0, SquareCubeCalculator.calculatePower(-5.0, 2), 0.001);
        assertEquals(8.0, SquareCubeCalculator.calculatePower(2.0, 3), 0.001);
        assertEquals(-125.0, SquareCubeCalculator.calculatePower(-5.0, 3), 0.001);
        // Add more test cases as needed
    }
}

        double result = EX10.calculateCube(input);

        assertEquals(expectedResult, result, delta);
    }
}
