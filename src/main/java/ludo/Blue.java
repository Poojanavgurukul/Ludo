package ludo;

import java.util.List;

public class Blue extends Yard {
    public Blue(List<Token>tokens) {
        this.startingPoint=13;
        this.tokens=tokens;
        this.finishingPoint=68;
        this.color=Color.BLUE;
    }
}
