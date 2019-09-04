public enum  Color {
    RED(0),GREEN(13),BLUE(26),YELLOW(39);
    private int startingPosition;
    Color(int startingPosition) {
        this.startingPosition=startingPosition;
    }
    public int getStartingPosition() {
        return startingPosition;
    }
}
