package ludo;

import java.util.Scanner;

public class Player {
    Yard yard;
    private int numberOfTokensOut = -1;
    private int id = 0;

    public Player(Yard yard, int id) {
        this.yard = yard;
        this.id = id;
    }

    private Token moveAToken(int numberOnDice) {
        System.out.println("which coin do you want move");
        Scanner scanner = new Scanner(System.in);
        int tokenToMove = scanner.nextInt();
        int position = yard.tokens.get(tokenToMove).moveBy(numberOnDice);
        if (position >= yard.finishingPoint) {
            System.out.println("win");
        }
        return yard.tokens.get(tokenToMove);
    }

    private Token moveTokenOut() {
        numberOfTokensOut++;
        yard.tokens.get(numberOfTokensOut).place(yard.startingPoint);
        return yard.tokens.get(numberOfTokensOut);
    }

    public Token play(Dice dice) {
        int numberOnDice = dice.roll();
        int numberOfTokensAtYard = 0;
        for (Token token : yard.tokens) {
            if (token.isAtYard()) {
                numberOfTokensAtYard++;
            }
        }
        System.out.println("Color " + yard.color + " NumberOnDice " + numberOnDice + " numberOfCoinsAtHome " + numberOfTokensAtYard);
        if (numberOnDice == 6 && numberOfTokensAtYard == 4) {
            return moveTokenOut();
        }
        if (numberOnDice == 6 && numberOfTokensAtYard == 0) {
            return moveAToken(numberOnDice);
        }
        if (numberOnDice == 6 && numberOfTokensAtYard != 4) {
            System.out.println("What do you want to do?");
            System.out.println("1. Move existing coin");
            System.out.println("2. Take out a coin");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                return moveAToken(numberOnDice);
            } else {
                return moveTokenOut();
            }
        } else if (numberOfTokensAtYard != 4) {
            return moveAToken(numberOnDice);
        }
        return null;
    }

    public int getId() {
        return this.id;
    }
}
