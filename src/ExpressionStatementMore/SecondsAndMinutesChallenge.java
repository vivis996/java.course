package ExpressionStatementMore;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    private static String getDurationString(int seconds) {
        // Two step approach to get hours
        var minutes = seconds / 60;
        return  getDurationString(minutes, seconds);
    }

    private static String getDurationString(int minutes, int seconds) {
        var hours = minutes / 60;

        var remainingMinutes = minutes % 60;
        var remainingSeconds = seconds % 60;

        return hours + " h " + remainingMinutes + " m " + remainingSeconds + " s";
    }
}
