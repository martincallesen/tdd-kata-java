
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumbersTest {
    @Test
    void convertSingleRomanNumbersToArabicNumber() {
        assertEquals(1, RomanNumbers.convertToArabicNumber("I"), "ArabicNumber");
    }
}
