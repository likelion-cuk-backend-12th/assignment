package java2.ex02;

public class Rabbit {


    public static int rabit(int a){
        if(a==1||a==2){
            return 1;
        }
        else{
            return rabit(a-1)+rabit(a-2);
        }
    }
    public static void main(String[] args) {

        int a = rabit(5);
        System.out.println(a);
    }
}
