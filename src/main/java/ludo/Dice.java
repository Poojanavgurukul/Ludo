package ludo;

public class Dice {
    public int getRolled() {
        return (int) (Math.random() * 6 + 1);
    }

    public int roll() {
        return (int) (Math.random() * 6 + 1);
    }
}
