package java2.ex00;

public class RecLion {

    static int count=0;
    public static void main(String[] args) {
        prionLion(count);
    }

    public static int prionLion(int i){

        if(count==10){
            System.out.println("Hello Baby Lion "+count);
            return 0;
        }
        System.out.println("Hello Baby Lion 0"+count);
        prionLion(count++);
        return 0;
    }
}
