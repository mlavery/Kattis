import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DNA {

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
        char[] dna = null;
        char[] virus = null;
        int dnaIndex = 0;
        int virusIndex = 0;
        int runningCount = 0;

        dna = sc.next().toCharArray();
        virus = sc.next().toCharArray();

        while (!(dnaIndex >= dna.length) && !(virusIndex >= virus.length)) {

            if (dna[dnaIndex] != virus[virusIndex]) {
                virusIndex++;
                runningCount++;
                while (!(virusIndex >= virus.length)) {
                    if (dna[dnaIndex] == virus[virusIndex])
                        break;

                    virusIndex++;
                    runningCount++;
                }
            }

            dnaIndex++;
            virusIndex++;
        }

        if (virusIndex >= virus.length) {
            int difference = dna.length - (virusIndex - 1);
            System.out.print("" + (runningCount + difference));
        }

        System.out.print("" + (runningCount));
        sc.close();
    }
}
