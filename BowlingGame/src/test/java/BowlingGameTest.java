import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
class BowlingGameTest {
    @DisplayName("All rolls goes to the gutter")
    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21})
    void gutterGame(int rollNumber){
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(0);
        assertEquals("0", bowlingGame.score(), "Score");
    }

}
