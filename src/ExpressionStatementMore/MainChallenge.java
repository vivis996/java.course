package ExpressionStatementMore;

public class MainChallenge {
    public static void main(String[] args) {
        var gameOver = true;
        int score = 10000,
                levelCompleted = 8,
                bonus = 200,
                finalScore = score;
        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;

        if (gameOver) {
            finalScore += levelCompleted * bonus;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        var finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
