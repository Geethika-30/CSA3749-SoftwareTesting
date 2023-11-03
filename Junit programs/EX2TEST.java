import org.junit.Test;
import static org.junit.Assert.*;

public class EX2TEST {

  /*  public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    } */

    @Test
    public void testStringComparison() {

        assertTrue(EX2.compareStrings("Hello", "Hello"));
        assertFalse(EX2.compareStrings("Hello", "World"));
        assertFalse(EX2.compareStrings("hello", "Hello"));
        assertTrue(EX2.compareStrings("", ""));
        assertFalse(EX2.compareStrings("Hello", null));
    }
}