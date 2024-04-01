package org.example.ex08;

import java.util.Arrays;

public class hw_6 {
    public static void main(String[] args) {
    String str = "Hello world! This is a test string.";


    String[] result = splitString(str);


    System.out.println(Arrays.toString(result));
    }



    public static String[] splitString(String str) {

        return str.split(" ");
    }
}
