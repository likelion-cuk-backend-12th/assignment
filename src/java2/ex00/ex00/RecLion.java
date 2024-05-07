package src.java2.ex00.ex00;

public class RecLion {
    public static int recursion(int idx){
        if(idx > 10)
            return -1;

        System.out.printf("Hello Baby Lion %02d\n",idx);
        return recursion(idx+1);
    }
    public static void main(String[] args) {
        int idx = 0;

        recursion(0);
    }
}
