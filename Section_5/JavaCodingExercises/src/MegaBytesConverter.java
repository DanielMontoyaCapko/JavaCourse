public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        }
    }
}

// TIP: Be extremely careful about spaces in the printed message.
//
// TIP: Use the remainder operator
//
// TIP: 1 MB = 1024 KB
//
// NOTE: Do not set kilobytes parameter value inside your method.
//
// NOTE: The solution will not be accepted if there are extra spaces.
//
// NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static ​like we have been doing so far in the course.
// NOTE: Do not add a  main method to solution code.