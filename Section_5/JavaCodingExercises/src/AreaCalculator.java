public class AreaCalculator {
    public static double area(double radius) {
        if(radius >= 0){
            return Math.PI * Math.pow(radius, 2);
        } else {
            return -1;
        }
    }

    public static double area(double x, double y) {
        if (x >= 0 && y >= 0){
            double areaRectangle = x * y;
            return areaRectangle;
            // I can put return x * y;
        } else {
            return -1;
        }
    }
}
