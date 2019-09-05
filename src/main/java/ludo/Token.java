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
    public void place(int startingPosition){
        position=startingPosition;
    }
    public void movedBy(int numberOnDice){
        this.position+=numberOnDice;
    }
}
