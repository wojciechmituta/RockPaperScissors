import java.util.Scanner;

public class UserDialogs {

    public static int getNumberOfRound() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your integer input:");
            String s = scanner.nextLine();
            try {
                int result = Integer.parseInt(s);
                return result;
            } catch (Exception e) {
                System.out.println("Wrong input. Try again.");
            }
        }
    }

    public static void getResult(int winn, int loss, int numberOfRounds) {
        if (winn == numberOfRounds) {
            System.out.println("\n You winn, congratulations");
        }
        if (loss == numberOfRounds) {
            System.out.println("\n You lost, try again!");
        }
    }

    public static boolean isEnd() {
        boolean finish = false;
        boolean end = false;
        while (!finish) {
            System.out.println("If you want to end the game press X, if you want try again press N");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            if (userInput.toUpperCase().equals("X")) {
                System.out.println("Are you sure? press y");
                String exit = scanner.next();
                end = exit.toUpperCase().equals("Y");
                if(end) finish = true;
            }
            if (userInput.toUpperCase().equals("N")) {
                System.out.println("Are you sure? press y");
                String exit = scanner.next();
                if (exit.toUpperCase().equals("Y")) {
                    end = false;
                    finish = true;
                }

            }
        }
        return end;
    }

    public static void printMenu() {
        System.out.println("Welcome to the game Paper Rock Scissors \n" + "Please get your Name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hallo " + name + " please enter number of rounds");


        System.out.println("Game instruction: \n" +
                "input Rock - play Rock \n" +
                "input Paper - play paper \n" +
                "input Scissors - play Scissors \n" +
                "input x = end of game \n" +
                "input n - new game ");
    }
}
