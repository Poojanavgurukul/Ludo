package ludo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LudoRunner {

    public static void main(String[] args) {
        List<Token>tokens =new ArrayList<>();
        for (int i = 1; i <=4 ; i++) {
            Token token=new Token(i);
            tokens.add(token);
        }
        Red red=new Red(tokens);
        Blue blue=new Blue(tokens);
        List<Player> players = Arrays
                .asList(new Player(red), new Player(blue));
        Game game = new Game(players);
        while (game.isRunning()) {
            game.start();
            if (!game.isRunning()){
                return;
            }
        }
    }
}
