package ExpressionStatementMore;

public class StatementsWhiteSpaceAndIdenting {
    public static void main(String[] args) {
        var myVariable = 50;

        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more");
        var anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
