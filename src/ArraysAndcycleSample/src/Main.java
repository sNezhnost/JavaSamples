package ArraysAndcycleSample.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TKolos on 21.02.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println(10000 + Math.random()*89999);

        int a = Integer.parseInt(input("количество строк"));
        int b = Integer.parseInt(input("количество столбцов"));
        String[][] stringArray = new String[a][b];

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++) {
                stringArray[i][j] = input(i+","+j);
            }
        }

//        for (int i = 0; i < stringArray.length; i++)
//        {
//            System.out.println(stringArray[i]);
//        }

        String findName = (input("имя для поиска"));
        System.out.println(findEl (stringArray, findName));

        System.out.println("While cycle");
        int gas = 50;
        while (gas > 0)
        {
            System.out.println(gas + " Hello world");
            gas--;
        }
        System.out.println("Do - While cycle");
        do {
            System.out.println(gas + " Hello world");
            gas++;
        } while (gas < 50);
        System.out.println("For cycle");
        for (int i = 50; i > 0; i--)
        System.out.println(i + " Hello world");

       /* int i = 0;
        for (; ;){
            if (i < 10){
                System.out.println(i);
            } else {
                break;
            }
            i++;
        }*/


    }
    public static String input(String value) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value " + value + ": ");
        return reader.readLine();
    }
    public static String findEl(String[][] strArr, String el)
    {
        /*
        Method finds first position of element el in array strArrand returns position
         */
        String resString = "Nothing works";
        for (int i = 0; i < strArr.length; i++)
        {
            for (int j = 0; j < strArr[0].length; j++) {
                if (el.equals(strArr[i][j]))
                {
                    System.out.println(strArr[i][j]);
                    resString =  el+" is element "+i+","+j;
                    return resString;
                }
            }
        }
        resString = el+" is absent in array.";
        return resString;
    }
}
