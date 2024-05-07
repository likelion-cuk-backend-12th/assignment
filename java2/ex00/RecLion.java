package java2.ex00;

public class RecLion {


    public static void recursion(int a){
        if(a==1){
            System.out.println("hello Baby Lion01");
            return;
        }
        else{
            if(a==10){
                System.out.println("hello Baby Lion"+a);
                recursion(a-1);
            }
            else{
                System.out.println("hello Baby Lion"+"0"+a);
                recursion(a-1);
            }


        }

    }

    public static void main(String[] args) {

        recursion(10);
    }

}
