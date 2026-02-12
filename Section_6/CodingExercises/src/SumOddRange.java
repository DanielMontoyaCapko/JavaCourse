public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0){
            return false;
        } else {
            if (number % 2 == 0){
                return false;
            } else {
                return true;
            }
        }
    }

    public static int sumOdd(int start, int end){

        int oddSum = 0;

        if ((start > 0 && end > 0) && (start <= end)){
            for (int i = start; i <= end; i++){
                if(isOdd(i)){
                    oddSum += i;
                }
            }
        } else {
            return -1;
        }
        return oddSum;
    }
}

// TIP: use the remainder operator to check if the number is odd
//
// NOTE: Both methods needs to be defined as public static like we have been doing so far in the course.
// NOTE: Do not add a main method to solution code.