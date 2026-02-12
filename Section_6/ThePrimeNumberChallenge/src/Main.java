public class Main {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 10; i <= 50 ; i++){
            if (isPrime(i) ){
                System.out.println("Number " + i + " is prime number");
                counter++;
                if (counter == 3){
                    System.out.println("Found 3 - Exit for loop");
                    break;
                }
            }
        }
        System.out.println("Total number of prime numbers is " + counter);
    }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
