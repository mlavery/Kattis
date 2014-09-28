import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DifferentProblem {

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
        long firstInteger;
        long secondInteger;

        while (sc.hasNextLong()) {
            firstInteger = sc.nextLong();
            secondInteger = sc.nextLong();

            System.out.println(Math.abs(firstInteger - secondInteger));
        }
        sc.close();
    }
}
