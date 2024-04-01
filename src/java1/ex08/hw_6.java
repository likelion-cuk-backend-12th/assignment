package java1.ex08;

public class hw_6 {
    public static void main(String[] args) {
        String str="안녕하세요! 여러분 반갑습니다.";
        String[] strarr = str.split(" ");

        for(int i=0; i<strarr.length; i++){
            System.out.println(strarr[i]);
        }
    }
}
