package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //input();

        try {
            methodThrowsNullPointerException();
        } catch (Exception e) {
            System.out.println("methodThrowsNullPointerException()");
            e.printStackTrace();
        }
        try {
            methodThrowsClassCastException();
        } catch (Exception e) {
            System.out.println("methodThrowsClassCastException():");
            e.printStackTrace();
        }

    }
    public static void input(){
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer.parseInt(br.readLine());
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Wrong format of data");
            try {
                Integer.parseInt(br.readLine());
            } catch (NumberFormatException e1) {
                System.out.println("Failed with two tries, dummy");
                System.exit(1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void methodThrowsClassCastException() throws Exception {
        throw new ClassCastException();
    }
    public static void methodThrowsNullPointerException() throws Exception {
        throw new NullPointerException();
    }
}