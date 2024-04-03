package java1.ex08;

import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        hw_6 h = new hw_6();
        String[] s= h.change(str);
        for(String i:s){
            System.out.println(i);
        }
    }

    public String[] change(String str) {
        String[] array = str.split(" ");
        return array;
    }

}
