package java1.ex08;

public class hw_7 {
    static String binary(int num){

        String str = "";
        while(num!=0){
            str += Integer.toString(num%2);
            num /= 2;
        }

        return new StringBuilder(str).reverse().toString();

    }
    public static void main(String[] args) {
        int num = 12;
        System.out.println(binary(num));
    }
}