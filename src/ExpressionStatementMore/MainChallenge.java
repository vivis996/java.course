package ExpressionStatementMore;

public class MainChallenge {
    public static void main(String[] args) {
        var gameOver = true;
        int score = 800,
            levelCompleted = 5,
            bonus = 100;

        var highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The nex highScore is " +
                    calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        var finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        return finalScore;
    }
}
