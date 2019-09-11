package ludo;

import java.util.List;

public class Yard {
    List<Token>tokens;
    Color color;
    int startingPoint;
    int finishingPoint;

    public Color getColor() {
        return color;
    }
    public int getNumberOfTokensAtYard() { // This should be in yards
        int numberOfCoinsAtHome = 0;
        for (Token token : tokens) {
            if (token.isAtYard()) {
                numberOfCoinsAtHome++;
            }
        }
        return numberOfCoinsAtHome;
    }
}
