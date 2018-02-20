package IfElseSample.src;

import java.io.*;

/**
 * Created by TKolos on 19.02.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        whoIsBigger(input("a"),input("b"));

    }

    public static String input(String value) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value " + value + ": ");
        return reader.readLine();
    }
    public static void whoIsBigger(String a, String b)
    {
        if (Integer.parseInt(a) > Integer.parseInt(b))
        {
            System.out.println("A is bigger");
        }else if (Integer.parseInt(a) == Integer.parseInt(b)){
            System.out.println("Values are the same");
        } else {
            System.out.println("B is bigger");
        }
    }
}
