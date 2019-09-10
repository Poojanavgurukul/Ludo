package ludo;

import java.util.Arrays;
import java.util.List;

public class RedYard extends Yard {
    public RedYard() {
        this.startingPoint = 0;
        this.tokens = Arrays.asList(new Token(1), new Token(2),
                new Token(3), new Token(4));
        this.finishingPoint = 56;
        this.color = Color.RED;
    }
}
