import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Multiples {

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
        int sum = 0;

        for (int i = 3; i < 1000; i++) {
            if ((i % 3) == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.print(sum);
    }
}
