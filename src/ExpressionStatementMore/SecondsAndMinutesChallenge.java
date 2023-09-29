package ExpressionStatementMore;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds +
                    "), must be a positive integer value";
        }
        // Two step approach to get hours
        var minutes = seconds / 60;
        return  getDurationString(minutes, seconds % 60);
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes +
                    "), must be a positive integer value";
        }
        if (seconds < 0 || seconds >= 59) {
            return "Invalid data for seconds (" + minutes +
                    "), must be between 0 and 59";
        }

        var hours = minutes / 60;

        var remainingMinutes = minutes % 60;

        return hours + " h " + remainingMinutes + " m " + seconds + " s";
    }
}
