package ludo;

import java.util.Scanner;

public class Player {
    Yard yard;
    private int numberOfTokensOut = -1;
    private int id;
    private Scanner scanner = new Scanner(System.in);

    public Player(Yard yard, int id) {
        this.yard = yard;
        this.id = id;
    }

    private void moveToken(int tokenToMove, int numberOnDice) {
        Token token = yard.tokens.get(tokenToMove);
        int currentPosition = token.getCurrentPosition() + numberOnDice;
        if (currentPosition > yard.finishingPoint) {
            System.out.println("not valid move");
            if (yard.getNumberOfTokensAtYard()< 3) {
                System.out.println("move other coin");
                int userInput = takeInput();
                moveToken(userInput, numberOnDice);
            }
        }
        if (currentPosition <= yard.finishingPoint) {
            int position = token.moveBy(numberOnDice);
            System.out.println(position);
            if (position == yard.finishingPoint) {
                Game.add(yard); // Use yards from board
            }
        }
    }

    private Token moveTokenToStartingPoint() {
        numberOfTokensOut++;
        yard.tokens.get(numberOfTokensOut).place(yard.startingPoint);
        return yard.tokens.get(numberOfTokensOut);
    }

    public Token play(Dice dice) {
        int numberOnDice = dice.roll();
        int numberOfTokensAtYard = yard.getNumberOfTokensAtYard();
        System.out.println("Color " + yard.color + " NumberOnDice " + numberOnDice + " numberOfCoinsAtHome " + numberOfTokensAtYard);
        if (numberOnDice == 6 && numberOfTokensAtYard == 4) {
            return moveTokenToStartingPoint();
        }
        if (numberOnDice == 6 && numberOfTokensAtYard == 0) {
            int tokenToMove = takeInput();
            moveToken(tokenToMove, numberOnDice);
        }
        if (numberOnDice == 6 && numberOfTokensAtYard != 4) {
            System.out.println("What do you want to do?");
            System.out.println("1. Move existing coin");
            System.out.println("2. Take out a coin");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                int tokenToMove = takeInput();
                moveToken(tokenToMove, numberOnDice);
            } else {
                return moveTokenToStartingPoint();
            }
        } else if (numberOfTokensAtYard != 4) {
            int tokenToMove = takeInput();
            moveToken(tokenToMove, numberOnDice);
        }
        return null;
    }

    public int getId() {
        return this.id;
    }

    private int takeInput() {
        System.out.println("Which coin do you want to move?");
        return scanner.nextInt();
    }
}