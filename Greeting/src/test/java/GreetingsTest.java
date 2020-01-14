import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GreetingsTest {
    @Test
    public void interpolatesToSimpleGreeting() {
        Assert.assertThat("Greeting", Greetings.greet("Bob"), is("Hello, Bob."));
    }
}
