import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class BowlingGameTest {
    @Test
    public void gutterGame(){
        BowlingGame bowlingGame = new BowlingGame();

        for(int i = 0 ; i < 21 ; i++) {
            bowlingGame.roll(0);
        }

        Assert.assertThat("Score", bowlingGame.score(), is("0"));
    }
}
