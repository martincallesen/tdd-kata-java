import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @DisplayName("When a number is divisible by 3 then Fizz should be printed")
    @ParameterizedTest
    @ValueSource(ints = {3,6,9,12})
    void printFizz(int number) {
        assertEquals("Fizz", FizzBuzz.print(number),"Print");
    }

}
