package ludo;

import java.util.List;

public class Red extends Yard {

    public Red(List<Token> tokens) {
        this.startingPoint=0;
        this.tokens=tokens;
        this.finishingPoint=56;
        this.color=Color.RED;
    }
}
