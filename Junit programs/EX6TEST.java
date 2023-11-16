import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EX6Test {

    @Test
    public void testConvertToBinary() {
        assertEquals("1101", DectoBin_Oct.convertToBinary(13));
        assertEquals("10101", DectoBin_Oct.convertToBinary(21));
        // Add more test cases as needed
    }

    @Test
    public void testConvertToOctal() {
        assertEquals("15", DectoBin_Oct.convertToOctal(13));
        assertEquals("25", DectoBin_Oct.convertToOctal(21));
        // Add more test cases as needed
    }
}
