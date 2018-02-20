package MethodSample.src;

import java.io.*;

/**
 * Created by TKolos on 14.02.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");
        String s = readFromKeyboard();
        String s1 = readFromKeyboard();
        int val = sum(Integer.parseInt(s), Integer.parseInt(s1));
        System.out.println("Sum is: " + val);
        val = difference(Integer.parseInt(s), Integer.parseInt(s1));
        System.out.println("Difference is: " + val);
        val = product(Integer.parseInt(s), Integer.parseInt(s1));
        System.out.println("Product is: " + val);
        float valQ = quotient(Float.parseFloat(s),Integer.parseInt(s1));
        System.out.println("Quotient is: " + valQ);
        String valS = sum(s, s1);
        System.out.println("Concatenation is: " + valS);

        s = readFromKeyboard();
        s1 = readFromKeyboard();
        valS = sum(s, s1);
        System.out.println("Concatenation is: " + valS);
        System.out.println();

    }
    public static String readFromKeyboard() throws IOException {
       /* BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));*/
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Vvedite zhachenie: ");
        return bufferedReader.readLine();
    }
    public static int sum(int a, int b) //addition
    {
        return a + b;
    }
    public static String sum()
    {
        return " ";
    }
    public static String sum(String a, String b)
    {
        return a + b;
    }
    public static int difference(int a, int b) //subtraction
    {
        return a - b;
    }
    public static int product(int a, int b) //multiplication
    {
        return a * b;
    }
    public static float quotient(float a, int b) //division
    {
        //System.out.println("a is : " + a);
        return a / b;
    }

}
