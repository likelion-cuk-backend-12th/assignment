package java2.ex00;

public class RecLion {
    public static void recall(int n) {
        if(n < 0)
            return;
        recall(n - 1);
        System.out.printf("Hello Baby Lion %02d\n", n);
    }
    public static void main(String[] args) {
        recall(10);
    }
}
