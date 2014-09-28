

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bread {

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
        String bread = sc.next();
        String doctor = sc.next();
    }
}
