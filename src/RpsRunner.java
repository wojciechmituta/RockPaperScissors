import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        boolean end = false;
        int winn = 0;
        int loss = 0;

        System.out.println("Welcome to the game Paper Rock Scissors \n" + "Please get your Name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hallo " + name + " please enter number of rounds");

        int numberOfRounds = scanner.nextInt();

        System.out.println("Game instruction: \n" +
                "input Rock - play Rock \n" +
                "input Paper - play paper \n" +
                "input Scissors - play Scissors \n" +
                "input x = end of game \n" +
                "input n - new game ");

        while (!end) {

            while (winn < numberOfRounds && loss < numberOfRounds) {
                System.out.println("\n Input your choice:");
                String moveOfPlayer = scanner.next();
                Choice choice = Choice.valueOf(moveOfPlayer.toUpperCase());
                Game game = new Game();
                Result result = game.checkResult(choice);

                if (result == Result.WINN) {
                    winn++;
                }
                if (result == Result.LOSS) {
                    loss++;
                }
                System.out.println("\n Your result: " + winn + "       " + "Computer result: " + loss);
            }

            getResult(winn, loss, numberOfRounds);
            winn = 0;
            loss = 0;
            end = isEnd(end, scanner);
        }
    }

    private static boolean isEnd(boolean end, Scanner scanner) {
        String finish = scanner.next();
        if (finish.toUpperCase().equals("X")) {
            System.out.println("Are you sure? press y");
            String exit = scanner.next();
            if (exit.toUpperCase().equals("Y")) {
                end = true;
            } else {
                end = false;
            }
        }
        if (finish.toUpperCase().equals("N")) {
            System.out.println("Are you sure? press y");
            String exit = scanner.next();
            if (exit.toUpperCase().equals("Y")) {
                end = false;
            } else {
                end = true;
            }
        }
        return end;
    }

    private static void getResult(int winn, int loss, int numberOfRounds) {
        if (winn == numberOfRounds) {
            System.out.println("\n You winn, congratulations");
        }
        if (loss == numberOfRounds) {
            System.out.println("\n You lost, try again!");
        }
        System.out.println("If you want to end the game press X, if you want try again press N");
    }
}
