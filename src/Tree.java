import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tree {

    private static Scanner sc = null;

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc;
        if (args != null && args.length > 0) {
            for(int i = 0; i != args.length; i++) {
                sc = new Scanner(new File(args[i]));
                runTest();
            }
        } else {
            sc = new Scanner(System.in);
            runTest();
        }
    }

    public static void runTest() {
        ArrayList<Integer> trees = new ArrayList<Integer>();

        int size = sc.nextInt();
        while (sc.hasNext())
            trees.add(sc.nextInt());

        Collections.sort(trees, Collections.reverseOrder());

        for (int i = 0; i <= trees.size() - 1; i++) {
            trees.set(i, trees.get(i) + i + 1);
        }

        Collections.sort(trees);

        System.out.print("" + (trees.get(trees.size() - 1) + 1));
    }
}
