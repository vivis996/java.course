package ExpressionStatementMore;

public class Main {
    public static void main(String[] args) {
        var kilometers = (100 * 1.609344);

        var highScore = 50;
        if (highScore > 25) {
            highScore += 1000; // Add bonus points
        }

        var health = 100;
        if ((health < 25) && (highScore >1000)) {
            highScore -= 1000;
        }
    }
}
