import java.util.Random;

public class Generator {
    private Random random = new Random();
    private final String INFO = "Choosing a computer is: ";

    public void getInfo(String name) {
        System.out.println(INFO + name);
    }

    public Choice getComputerMove() {
        int result = random.nextInt(3) + 1;
        if (result == 1) {
            getInfo("paper");
            return Choice.PAPER;
        }
        if (result == 2) {
            getInfo("rock");
            return Choice.ROCK;
        }
        getInfo("scissors");
        return Choice.SCISSORS;
    }
}
