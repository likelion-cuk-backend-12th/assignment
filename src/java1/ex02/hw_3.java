package java1.ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1= 1;
        short s2= 2;
        short s3 = (short) (s1+s2);

        //incompatible types: possible lossy conversion from int to short 오류 발생
        //short s3 = s1+s2; -> short s3 = (short) (s1+s2); 로 변경
        //s1, s2이 1, 2 이므로 정수형이지만 s3는 short로 선언되어 있어 타입 오류가 발생한다.

    }
}
