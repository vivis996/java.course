package ExpressionStatementMore;

public class OverloadedChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + " cm");
        System.out.println("68in = " + convertToCentimeters(68) + " cm");
    }

    private static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    private static double convertToCentimeters(int feet, int inches) {
        var feetToInches = (feet * 12);
        var totalInches = feetToInches + inches;
        var result = convertToCentimeters(totalInches);
        return result;
    }
}
