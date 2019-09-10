package ludo;

import java.util.Collections;
import java.util.List;

public class BlueYard extends Yard {
    public BlueYard(List<Token> tokens) {
        this.startingPoint = 13;
        this.tokens = tokens;
        this.finishingPoint = 69;
        this.color = Color.BLUE;
    }

    public BlueYard() {
        this.startingPoint = 0;
        this.finishingPoint = 56;
        this.color = Color.BLUE;
        this.tokens = Collections.emptyList();
    }
}
