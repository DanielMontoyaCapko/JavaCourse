public class OverloadedChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int remainingInches){
        double feetToInches = feet * 12;
        return (feetToInches + remainingInches) * 2.54;

        //return convertToCentimeters((feet * 12) + inches);

        //double feetToInches = feet * 12;
        //double totalInches = feetToInches + inches;
        //double result = convertToCentimeters(totalInches);
        //return result;
    }
}


// 1 inch = 2.54 cm
// 1 foot = 12 inches