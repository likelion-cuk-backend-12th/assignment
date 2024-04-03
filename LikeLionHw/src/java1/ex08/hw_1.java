package java1.ex08;

import java.util.Scanner;

class hw_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        hw_1 h = new hw_1();
        h.change(str);
    }
   public void change(String str){
       String answer = str.toLowerCase();
       System.out.println(answer);
   }
}

