package VariableSample.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by TKolos on 07.02.2018.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        for (int i=1; i<=5; i++)
            System.out.println("Hello world");
        //System.out.println("Hello world");

        int integerValue = 4;
        short shortValue = 56;
        long longValue = 999999999999999999L;
        byte byteValue = -128;
        float floatValue = 1.01f;
        double doubleValue = 1.02;
        char charValue = 'c';
        boolean boolValue = true;
        String mama = "Мама";
        String myla = "мыла";
        String ramy = "раму";

        int integerNewValue = shortValue + integerValue;
        integerNewValue = shortValue / integerValue;
        integerNewValue = shortValue * integerValue;
        integerNewValue = shortValue - integerValue;
        integerNewValue = integerValue % shortValue;


        System.out.println("integer value is: " + integerValue);
        System.out.println(shortValue);
        System.out.println(longValue);
        System.out.println(byteValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(boolValue);
        System.out.println("Остаток от деления " + integerNewValue);
        System.out.println(mama + " " + myla + " " + ramy);

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Введите имя: ");
        String name = bufferedReader.readLine();
        System.out.print("Ведите возраст: ");
        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println("Ваш возраст: " + nAge+ ". Вас зовут " + name);

    }
}
