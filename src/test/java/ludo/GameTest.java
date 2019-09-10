package ludo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class GameTest {

    @Test
    public void should_get_winner(){
        RedYard redYard = new RedYard();
        BlueYard blueYard = new BlueYard();
        List<Yard> yards = asList(redYard, blueYard);

        List<Cell> cells = new ArrayList<>(72);

        Dice dice = new Dice();

        Board board = new Board(yards, cells, dice);

        Player playerWithRedYard = new Player(redYard, 1);
        Player playerWithBlueYard = new Player(redYard, 2);
        List<Player> players = asList(playerWithRedYard, playerWithBlueYard);
        Game game  = new Game(board, players); //TODO
        game.start();
        game.finish();

        Player winner = game.getCurrentWinner();

        Player expectedWinner = new Player(new RedYard(), 1);
        Assert.assertEquals(expectedWinner.getId(), winner.getId());

//        Player playerWithRedYard = game.getWinner();
//        Assert.assertNull(playerWithRedYard); //TODO
    }
}
