package ExpressionStatementMore;

public class MainChallenge {
    public static void main(String[] args) {
        var newGameOver = true;
        int newScore = 10000,
            newLevelCompleted = 8,
            newBonus = 200,
            newFinalScore = newScore;
        if ( newGameOver) {
            newFinalScore +=  newLevelCompleted * newBonus;
            System.out.println("Your final score was " + newFinalScore);
        }
    }
}
