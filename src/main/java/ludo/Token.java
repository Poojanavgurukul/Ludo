package ludo;

public class Token {
    private int id;
    int position=-1;

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public Token(int id) {
        this.id=id;
    }
    public boolean isAtYard(){
        return position==-1;
    }
}
