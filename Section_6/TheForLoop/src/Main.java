public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for (double newRate = 7.5; newRate <= 10;  newRate += 0.25 ){ // My solution => rate = rate + 0.25
            double newInterestAmount = calculateInterest(100.0, newRate);
            if (newInterestAmount > 8.5){
                break;
            }
            System.out.println("100 at " + newRate + "% interest = " + newInterestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
