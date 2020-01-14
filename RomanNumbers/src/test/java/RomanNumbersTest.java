import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RomanNumbersTest {
    @Test
    public void convertSingleRomanNumbersToArabicNumber() {
        Assert.assertThat("ArabicNumber", RomanNumbers.convertToArabicNumber("I"), is(1));
    }
}
