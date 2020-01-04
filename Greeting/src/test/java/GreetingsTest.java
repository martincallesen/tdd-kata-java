import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
    public void interpolatesToSimpleGreeting() {
        assertEquals("Hello, Bob.", Greetings.greet("Bob"),"Greeting");
    }

}
