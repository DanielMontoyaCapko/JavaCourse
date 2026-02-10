public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999){
            return false;
        } else {
            return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }
}

// HINT: Use the switch statement.
//
// NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.
//
// NOTE: Do not add a main method to solution code.
//
// NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.
