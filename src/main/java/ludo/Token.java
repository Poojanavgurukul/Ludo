package ludo;

public class Token {
    private int id;

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public Token(int id) {
        this.id=id;
    }
}
