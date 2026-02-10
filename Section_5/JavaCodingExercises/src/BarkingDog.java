public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (((0 <= hourOfDay && hourOfDay < 8) || (hourOfDay == 23)) && barking){
            return true;
        } else {
            return false;
        }
    }
}

// TIP: Use the if else statement with multiple conditions.
//
// NOTE: The shouldWakeUp method  needs to be defined as public static ​like we have been doing so far in the course.
//
// NOTE: Do not add a  main method to solution code.