import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {
    @Test
    void interpolatesToSimpleGreeting() {
        assertEquals("Hello, Bob.", Greetings.greet("Bob"),"Greeting");
    }

}
