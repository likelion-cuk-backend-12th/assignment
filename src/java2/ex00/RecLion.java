package java2.ex00;

public class RecLion {

    public static void main(String[] args) {
        HelloBabyLion(10);
    }

    public static void HelloBabyLion(int cnt){
        if (cnt == 0){
            System.out.println("Hello Baby Lion 10");
            return;
        }else if (cnt == 10){
            System.out.println("Hello Baby Lion 00");
        }else {
            System.out.println("Hello Baby Lion 0" + (10-cnt));
        }
        HelloBabyLion(--cnt);
    }
}

