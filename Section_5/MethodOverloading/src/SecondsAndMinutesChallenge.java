public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(200, 38));
        System.out.println(getDurationString(3600));

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(-65,-45));

        System.out.println(getDurationString1(3945));
        System.out.println(getDurationString1(65,45));
    }

    // My solution //
    public static String getDurationString (int seconds){
        if(seconds >= 0){
            // Could create int minutes = seconds / 60;
            return getDurationString((seconds / 60), seconds % 60);
        } else {
            return ("Sec parameters should be >= 0.");
        }
    }

    public static String getDurationString (int minutes, int seconds){
        int totalHours = minutes / 60;
        int totalMinutes = minutes % 60;
        if((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))){
            return (totalHours + "h " + totalMinutes + "m " + seconds + "s");
        } else {
            return ("Min parameter should be >= 0, and sec parameters should be >= 0 and <= 59.");
        }
    }

    // Course Solution without validation section //
    public static String getDurationString1 (int seconds){
        int minutes = seconds / 60;
        return getDurationString1(minutes, seconds);
    }

    public static String getDurationString1 (int minutes, int seconds){
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}

// 1 min = 60 sec
// 1 hour = 3600 sec

// Add validation.
// For first method -> sec parameter should be >= 0
// For second method -> min parameter should be >= 0, and sec parameters should be >= 0 and <= 59.
// If invalid values -> print meaningful message to user