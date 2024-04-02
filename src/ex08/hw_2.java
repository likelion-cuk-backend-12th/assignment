package src.ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String result ="";
        for(int  i = 0; i < a.length(); i++)
        {
            int temp = a.charAt(i);

            if((temp >= 65)&&(temp <= 90))  //대문자
            {
                temp += 32;
            }

            result += (char)temp;
        }

        System.out.println(result);


    }

}
