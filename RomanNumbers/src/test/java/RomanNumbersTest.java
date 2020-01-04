
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    @Test
    public void convertSingleRomanNumbersToArabicNumber() {
        assertEquals(1, RomanNumbers.convertToArabicNumber("I"), "ArabicNumber");
    }
}
