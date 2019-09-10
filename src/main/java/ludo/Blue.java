package ludo;

import java.util.List;

public class Blue extends Yard {
    public Blue(List<Token>tokens) {
        this.startingPoint=0;
        this.tokens=tokens;
        this.finishingPoint=56;
        this.color=Color.BLUE;
    }
}
