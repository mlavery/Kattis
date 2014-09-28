import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cookie {

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
        final ArrayList<Integer> cookies = new ArrayList<Integer>();
        String temp;
        int removeCookie;

        while (sc.hasNext()) {
            temp = sc.next();

            if (temp.equals("#")) {
                int size = cookies.size();
                if ((size % 2) == 0)
                    removeCookie = (size / 2) + 1;
                else
                    removeCookie = (size + 1) / 2;

                System.out.println(cookies.get(--removeCookie).toString());
                cookies.remove(removeCookie);
            } else {
                int value = new Integer(temp);
                int index = Collections.binarySearch(cookies, value);
                if (index < 0)
                    cookies.add((index + 1) * -1, value);
                else
                    cookies.add(index, value);

            }
        }
        sc.close();
    }
}