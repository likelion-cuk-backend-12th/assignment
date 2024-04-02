package java1.ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        String str = sc.nextLine();

        for(int i=0; i< str.length(); i++){
            int temp=str.charAt(i);

            if(temp==122){
                temp=97;
            }else if(temp==90){
                temp=65;
            }else{
                temp++;
            }
            System.out.print((char)temp);
        }
    }
}
