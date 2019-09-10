package ludo;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    List<Player> players;
    int currentPlayerIndex;
    static List<Yard> colors = new ArrayList<>();
    private int red=0;
    private int green=0;
    private int blue=0;
    private int yellow=0;

    public Game(List<Player> players) {
        this.players = players;
        this.currentPlayerIndex = 0;
    }

    public Game(Board board, List<Player> players) {

        this.board = board;
        this.players = players;
    }

    public void start() {
        Player currentPlayer = players.get(currentPlayerIndex);
        currentPlayer.play();
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
    static void add(Yard yard) {
        colors.add(yard);
    }
    public boolean isRunning() {
        return !getWinner();
    }

    public boolean getWinner() {
        Color winner = tokenCounter();
        int neededTokenForWinner = 1;
        boolean red = this.red == neededTokenForWinner;
        boolean green = this.green == neededTokenForWinner;
        boolean blue = this.blue == neededTokenForWinner;
        boolean yellow = this.yellow == neededTokenForWinner;
        if (red || green || blue || yellow) {
            System.out.println(winner);
            return true;
        }
        return false;
    }

    public Player getCurrentWinner() { // Rename this to getWinner
        return new Player(new Yard(), 1);
    }

    private Color tokenCounter() {
        for (Yard yard : colors) {
            switch (yard.getColor()) {
                case RED:
                    this.red += 1;
                    break;
                case GREEN:
                    this.green += 1;
                    break;
                case BLUE:
                    this.blue += 1;
                    break;
                case YELLOW:
                    this.yellow += 1;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + yard.getColor());
            }
            return yard.getColor();
        }
        return null;
    }

    public void finish() {

    }
}

