package java1.ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        hw_3 h = new hw_3();
        h.change(str);
    }

    public void change(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print((char)(str.charAt(i)+1));
        }
    }
}
