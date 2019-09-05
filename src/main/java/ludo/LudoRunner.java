package ludo;

import java.util.Arrays;
import java.util.List;

public class LudoRunner {
    public static void main(String[] args) {
        List<Player> players = Arrays
                .asList(new Player(Color.RED), new Player(Color.BLUE));
        Game game = new Game(players);
        game.start();
    }
}
