package ludoTest;

import ludo.Game;
import ludo.Player;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void should_get_winner(){
        Game game  = new Game(null); //TODO
        Player player = game.getWinner();
        Assert.assertNull(player); //TODO
    }
}
