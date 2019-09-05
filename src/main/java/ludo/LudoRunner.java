package ludo;

import java.util.Arrays;
import java.util.List;

public class LudoRunner {
    public static void main(String[] args) {
        // TODO create coins, then pass it to yard while creating
        // TODO Create a yard and pass it to player
        List<Player> players = Arrays
                .asList(new Player(Color.RED), new Player(Color.BLUE));
        Game game = new Game(players);
        game.start();
    }
}
