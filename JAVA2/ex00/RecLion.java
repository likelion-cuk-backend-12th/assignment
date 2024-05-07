package JAVA2.ex00;

public class RecLion {
    public static void printLion(int number) {
        if (number > 10) {
            return;
        }
        System.out.printf("Hello Baby Lion %02d\n", number);
        printLion(number + 1);
    }

    public static void main(String[] args) {
        printLion(0);
    }
}
