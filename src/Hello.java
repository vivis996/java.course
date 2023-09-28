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

        var makeOfCar = "Volkswagen";
        var isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This is domestic to our country");
        }
        var s = isDomestic ? "This car is domestic" : "This car isn't domestic";

        System.out.println(s);

        var myFirstValue = 20d;
        var mySecondValue = 80d;
        var myValuesTotal = (myFirstValue + mySecondValue) * 100d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        var theRemainder = myValuesTotal % 40d;
        System.out.println("theRemainder = " + theRemainder);
        var isNoRemainder = theRemainder == 0;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some reminder");
        }
    }
}
