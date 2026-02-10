public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int firstInt = (int) (first * 1000);
        int secondInt = (int) (second * 1000);

        return firstInt == secondInt;
    }
}



// TIP: Use paper and pencil.
//
// TIP: Use casting.
//
// NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
// NOTE: Do not add a  main method to solution code.