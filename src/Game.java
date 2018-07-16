public class Game {
    Generator generator = new Generator();
    private final String INFO = "Choosing a computer is: ";

    public Result checkResult(Choice playerChoice) {
        Choice computerChoice = generator.getComputerMove();
        if (playerChoice == computerChoice)
            return Result.DRAW;
        switch (playerChoice) {
            case ROCK:
                return (computerChoice == Choice.SCISSORS ? Result.WINN : Result.LOSS);
            case PAPER:
                return (computerChoice == Choice.SCISSORS ? Result.LOSS : Result.WINN);
            case SCISSORS:
                return (computerChoice == Choice.PAPER ? Result.WINN : Result.LOSS);
        }
        return null;
    }
 }