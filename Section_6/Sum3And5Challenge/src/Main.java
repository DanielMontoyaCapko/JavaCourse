public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int totalSum = 0;

        for (int i = 1; i <= 1000 && counter < 5; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("The number " + i + " meets the conditions");
                totalSum += i;
                counter++;
            }
        }
        System.out.println("Total sum of the numbers that met the conditions is: " + totalSum);
    }
}