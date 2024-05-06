package java2.ex00;


public class RecLion {
    static void Lion(int i) {
        if (i < 0) {
            return;
        } else {
            Lion(i - 1);
            System.out.println("Hello Baby Lion 0" + i);
        }
    }

    public static void main(String[] args) {
        Lion(9);
        System.out.println("Hello Baby Lion 10");
    }
}
