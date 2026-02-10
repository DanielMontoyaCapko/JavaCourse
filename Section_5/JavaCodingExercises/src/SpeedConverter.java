public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour /1.609);
        }
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}

// TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.
//
// NOTE: All methods should be defined as public static like we have been doing so far in the course.
//
// NOTE: 1 mile per hour is 1.609 kilometers per hour
//
// NOTE: Do not add a main method to the solution code.