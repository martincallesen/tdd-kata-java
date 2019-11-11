import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingsTest {
    @Test
    public void greetingWithName() {
        String greet = greet("Bob");
        assertThat("Greet", greet, is("Hello, Bob."));
    }

    private String greet(String... name) {
        return null;
    }

//    @Test
//    public void greetingWithNull() {
//        String greet = greet(null);
//        assertThat("Greet", greet, is("Hello, my friend."));
//    }
//
//    @Test
//    public void greetingShout() {
//        String greet = greet("BOB");
//        assertThat("Greet", greet, is("HELLO, BOB!"));
//    }
//
//    @Test
//    public void greetingWithTwoNames() {
//        String greet = greet("Bob", "Larry");
//        assertThat("Greet", greet, is("Hello, Bob and Larry."));
//    }
//
//    @Test
//    public void greetingWithMultipleNames() {
//        String greet = greet("Bob", "Larry", "Brian");
//        assertThat("Greet", greet, is("Hello, Bob, Larry and Brian."));
//    }
//
//    @Test
//    public void greetingWithMultipleNamesAndShout() {
//        String greet = greet("Bob", "LARRY", "Brian");
//        assertThat("Greet", greet, is("Hello, Bob and Brian. AND LARRY!"));
//    }
//
//    @Test
//    public void greetingWithMultipleNamesAndComma() {
//        String greet = greet("Bob", "Larry, Brian");
//        assertThat("Greet", greet, is("Hello, Bob, Larry and Brian."));
//    }
//
//    @Test
//    public void greetingWithMultipleNamesAndEscaped() {
//        String greet = greet("Bob", "\"Larry, Brian\"");
//        assertThat("Greet", greet, is("Hello, Bob and Larry, Brian."));
//    }
}
