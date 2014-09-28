
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ahhhMain {

    private static Scanner sc = null;

    public static void main(String[] args) throws FileNotFoundException
    {
        if (args != null && args.length > 0) {
            for(int i = 0; i != args.length; i++) {
                sc = new Scanner(new File(args[i]));
                runTest();
            }
        } else {
            sc = new Scanner(System.in);
            runTest();
        }

        if(sc != null)
            sc.close();
    }

    public static void runTest() {
        String marius = sc.next();
        String doctor = sc.next();

        // solve test case and output answer
        if (marius.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
