package ex00;

public class RecLion {
    public static void babyLion(int n){
        if (n <= 10){
            System.out.println("Hello Baby Lion" + (n < 10 ? "0"+n: n));
            babyLion(n+1);
        }


    }
    public static void main(String[] args) {
        babyLion(0);
    }
}
