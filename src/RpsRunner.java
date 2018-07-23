import java.util.InputMismatchException;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        UserDialogs.printMenu();

        int numberOfRounds = UserDialogs.getNumberOfRound();

        boolean end = false;
        int win = 0;
        int loss = 0;

        Game game = new Game();

        while (!end) {

            while (win < numberOfRounds && loss < numberOfRounds) {
                System.out.println("\n Input your choice:");
                String moveOfPlayer = scanner.next();
                if (moveOfPlayer.toUpperCase().equals("ROCK") || moveOfPlayer.toUpperCase().equals("PAPER") || moveOfPlayer.toUpperCase().equals("SCISSORS")) {
                    Choice choice = Choice.valueOf(moveOfPlayer.toUpperCase());
                    Result result = game.checkResult(choice);
                    if (result == Result.WIN) {
                        win++;
                    }
                    if (result == Result.LOSS) {
                        loss++;
                    }
                    System.out.println("\n Your result: " + win + "       " + "Computer result: " + loss);
                } else {
                    System.out.println("You entered incorrect data, please try again");
                }
            }

            UserDialogs.getResult(win, loss, numberOfRounds);
            win = 0;
            loss = 0;
            end = UserDialogs.isEnd();
        }
    }
}
