package ludo;

import java.util.Arrays;

public class BlueYard extends Yard {
    public BlueYard() {
        this.startingPoint = 13;
        this.tokens = Arrays.asList(new Token(1), new Token(2),
                new Token(3), new Token(4));
        this.finishingPoint = 69;
        this.color = Color.BLUE;
    }

}
