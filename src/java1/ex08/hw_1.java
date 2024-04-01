package java1.ex08;
import java.util.Scanner;


public class hw_1 {
    static String toUpper(String str){
        char[] arr = str.toCharArray();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 97){
                arr[i] = (char)(arr[i]-32);
            }
        }
        String str2 = String.valueOf(arr);
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toUpper(str));



    }
}
