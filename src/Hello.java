public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Daniel");

        var isAlien = false;
        if (!isAlien){
            System.out.println("It's not an alien");
            System.out.println("And I'm scared of aliens");
        }

        var topScore = 80;

        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        var secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top Score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }

        var newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        var isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
    }
}
