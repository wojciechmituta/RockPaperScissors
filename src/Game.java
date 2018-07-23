public class Game {
    private Generator generator = new Generator();

    public Result checkResult(Choice playerChoice) {

        Choice computerChoice = generator.getComputerMove();

        if (playerChoice == computerChoice)
            return Result.DRAW;
        switch (playerChoice) {
            case ROCK:
                return (computerChoice == Choice.SCISSORS ? Result.WIN : Result.LOSS);
            case PAPER:
                return (computerChoice == Choice.SCISSORS ? Result.LOSS : Result.WIN);
            case SCISSORS:
                return (computerChoice == Choice.PAPER ? Result.WIN : Result.LOSS);
        }
        return null;
    }
}