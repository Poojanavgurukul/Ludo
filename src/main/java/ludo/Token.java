package ludo;

public class Token {
    private int id;

    public int getPosition() {
        return position;
    }

    int position=-1;

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public Token(int id) {
        this.id=id;
    }
    public boolean isAtYard(){
        return this.position==-1;
    }
    public void place(int startingPosition){
        this.position=startingPosition;
    }

    public int moveBy(int numberOnDice) {
        this.position+=numberOnDice;
        return this.position;
    }
}
