package ludo;

import java.util.Collections;
import java.util.List;

public class RedYard extends Yard {
    public RedYard(List<Token> tokens) {
        this.startingPoint = 0;
        this.tokens = tokens;
        this.finishingPoint = 56;
        this.color = Color.RED;
    }

    public RedYard() {
        this.startingPoint = 0;
        this.finishingPoint = 56;
        this.color = Color.RED;
        this.tokens = Collections.emptyList();
    }
}
