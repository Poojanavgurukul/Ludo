package ludo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LudoRunner {

    public static void main(String[] args) {
        List<Yard> yards = new ArrayList<>();
        RedYard redYard = new RedYard();
        BlueYard blueYard = new BlueYard();
        yards.add(redYard);
        yards.add(blueYard);

        List<Cell> cells = new ArrayList<>();
        for (int i = 0; i < 72; i++) {
            Cell cell = new Cell(i);
            cells.add(cell);
        }

        Dice dice = new Dice();

        Board board = new Board(yards, cells, dice);


        List<Player> players = Arrays
                .asList(new Player(redYard,1), new Player(blueYard,2));

        Game game = new Game(board, players);
        while (game.isRunning()) {
            game.start();
            if (!game.isRunning()) {
                return;
            }
        }
    }
}
