package ludo;

import java.util.Scanner;

public class Player {
    Yard yard;
    private int numberOfTokensOut=-1;

    public Player(Yard yard) {
        this.yard=yard;
    }
    Dice dice = new Dice();

    private void moveAToken(int numberOnDice) {
        System.out.println("which coin do you want move");
        Scanner scanner=new Scanner(System.in);
        int tokenToMove=scanner.nextInt();
        yard.tokens.get(tokenToMove).moveBy(numberOnDice);
    }
    private void moveTokenOut() {
        numberOfTokensOut++;
        yard.tokens.get(numberOfTokensOut).place(yard.startingPoint);
    }
    public void play() {
        int numberOnDice=dice.getRolled();
        int numberOfTokensAtYard=0;
        for (Token token:yard.tokens) {
            if (token.isAtYard()){
                numberOfTokensAtYard++;
            }
        }
        System.out.println("Color "+yard.color+" NumberOnDice "+numberOnDice+" numberOfCoinsAtHome "+numberOfTokensAtYard);
        if (numberOnDice==6&&numberOfTokensAtYard==4){
            moveTokenOut();
        }
        if (numberOnDice==6 && numberOfTokensAtYard==0){
            moveAToken(numberOnDice);
        }
        if (numberOnDice == 6 && numberOfTokensAtYard !=4) {
            System.out.println("What do you want to do?");
            System.out.println("1. Move existing coin");
            System.out.println("2. Take out a coin");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                moveAToken(numberOnDice);
            } else {
                moveTokenOut();
            }
        }else if(numberOfTokensAtYard !=4){
            moveAToken(numberOnDice);
        }
    }
}
