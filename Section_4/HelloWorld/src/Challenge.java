public class Challenge {
    public static void main(String[] args) {
        double first = 30.00d;
        double second = 8.00d;

        double myValue = (first + second) * 100.00d;

        System.out.println("MyValue = " + myValue);

        double theReminder = myValue % 40.00d;

        System.out.println("TheReminder = " + theReminder);

        boolean check = (theReminder == 0) ? true : false;

        System.out.println("Check = " + check);

        if(!check){
            System.out.println("Got some remainder");
        }




    }
}
