import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {
    @Test
    public void fizz() {
        Assert.assertThat("Print", FizzBuzz.print(3), is("Fizz"));
    }
}