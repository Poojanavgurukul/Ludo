package ludo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void ShouldCreateTheBoard() {
        RedYard redYard = new RedYard();
        BlueYard blueYard = new BlueYard();

        List<Yard> yards = asList(redYard, blueYard);
        List<Cell> cells = new ArrayList<>(72);
        Dice dice = new Dice();
        Board board = new Board(yards, cells, dice);

// Continue this ...
    }
}