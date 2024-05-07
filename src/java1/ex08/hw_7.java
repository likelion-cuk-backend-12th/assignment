package ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str ="";
        while(true)
        {
            if(num == 1)
            {
                str += "1";
                break;
            }
            str += Integer.toString(num % 2);
            num /= 2;
        }

        String result ="";
        for(int i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);

        System.out.println(result);
    }
}
