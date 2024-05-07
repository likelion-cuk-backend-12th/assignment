package java2.ex01;

public class Factorial {

    public static int fac(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*fac(a-1);
        }
    }
    public static void main(String[] args) {
       int temp = fac(10);
       System.out.println(temp);

    }
}
