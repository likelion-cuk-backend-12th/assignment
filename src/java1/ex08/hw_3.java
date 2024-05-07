package ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String result ="";
        for(int  i = 0; i < a.length(); i++)
        {
            int temp = a.charAt(i);

            if(temp == 122)
                temp = 97;
            else if(temp == 90)
                temp = 65;
            else
                temp += 1;

            result += (char)temp;
        }

        System.out.println(result);


    }
}
