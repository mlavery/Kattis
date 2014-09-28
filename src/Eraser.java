import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Eraser {

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
        char[] file;
        char[] erase;

        int number = sc.nextInt();

        file = sc.next().toCharArray();
        erase = sc.next().toCharArray();

        if (number % 2 > 0)
            reverseBit(file);

        for (int i = 0; i <= file.length - 1; i++) {
            if (file[i] != erase[i]) {
                System.out.println("Deletion failed");
                return;
            }
        }

        System.out.println("Deletion succeeded");
    }

    private static void reverseBit(final char[] file) {

        for (int i = 0; i <= file.length - 1; i++) {
            if (file[i] == '1')
                file[i] = '0';
            else
                file[i] = '1';
        }
    }
}
