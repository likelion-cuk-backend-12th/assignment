package java1.ex08;
import java.util.Scanner;

public class hw_3 {
    static String trans(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 90 || arr[i] == 122)
                arr[i] = (char)(arr[i]-25);
            else arr[i] = (char)(arr[i]+1);
        }
        String str2 = String.valueOf(arr);
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(trans(str));

    }
}
